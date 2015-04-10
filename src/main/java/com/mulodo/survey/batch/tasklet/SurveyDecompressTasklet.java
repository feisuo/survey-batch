package com.mulodo.survey.batch.tasklet;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.core.io.Resource;

public class SurveyDecompressTasklet implements Tasklet {

	private Resource resource;
	private String targetDirectory;
	private static final String ZIPFILE = "zip";

	@Override
	public RepeatStatus execute(StepContribution contribution,
			ChunkContext chunkContext) throws Exception {
		File[] listOfFiles = resource.getFile().listFiles();
		for(File file : listOfFiles){
			if(ZIPFILE.equalsIgnoreCase(FilenameUtils.getExtension(file.getName()))){
				unzipFile(file);
			}
		}
		return RepeatStatus.FINISHED;
	}

	private void unzipFile(File file) throws IOException {
		ZipInputStream zis = new ZipInputStream(new BufferedInputStream(new FileInputStream(file)));
		File targetDirectoryAsFile = new File(targetDirectory);
		if (!targetDirectoryAsFile.exists()) {
			FileUtils.forceMkdir(targetDirectoryAsFile);
		}
		String fileNameWithOutExt = FilenameUtils.removeExtension(file.getName());
		File target = new File(targetDirectory, fileNameWithOutExt +".csv");
		BufferedOutputStream dest = null;
		while (zis.getNextEntry() != null) {
			if (!target.exists()) {
				target.createNewFile();
			}
			FileOutputStream fos = new FileOutputStream(target);
			dest = new BufferedOutputStream(fos);
			IOUtils.copy(zis, dest);
			dest.flush();
			dest.close();
		}
		zis.close();
		if (!target.exists()) {
			throw new IllegalStateException(
					"Could not decompress anything from the archive!");
		}
	}

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public String getTargetDirectory() {
		return targetDirectory;
	}

	public void setTargetDirectory(String targetDirectory) {
		this.targetDirectory = targetDirectory;
	}
	
}
