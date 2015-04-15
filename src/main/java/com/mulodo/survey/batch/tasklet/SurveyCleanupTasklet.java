/**
 * 
 */
package com.mulodo.survey.batch.tasklet;

import java.io.File;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

/**
 * @author TriLe
 */
public class SurveyCleanupTasklet implements Tasklet
{
	// cleanupDirectory is folder name that we want to clean up
    private String cleanupDirectory;

    /*
     * (non-Javadoc)
     * @see org.springframework.batch.core.step.tasklet.Tasklet#execute(org.
     * springframework.batch.core.StepContribution,
     * org.springframework.batch.core.scope.context.ChunkContext)
     */
    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext)
            throws Exception
    {

        File folder = new File(cleanupDirectory);

        // Check is folder
        if (folder.isDirectory()) {
            // Delete all file in folder
            for (File file : folder.listFiles()) {
                file.delete();
            }
        } else {
            throw new IllegalArgumentException("Input cleanup directory invalid");
        }

        return RepeatStatus.FINISHED;
    }

    /**
     * @param cleanupDirectory
     *            the cleanupDirectory to set
     */
    public void setCleanupDirectory(String cleanupDirectory)
    {
        this.cleanupDirectory = cleanupDirectory;
    }

}
