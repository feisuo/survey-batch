##Benchmark result

Import and copy *1.000.000* records

###Import use Hibernate

| Chunk size | Record | Duration 1st (ms) | 2nd | 3rd |
| ------------- | ------------- |	------------- |	-------------	| ------------- |
| 50000 | 1000000 |	307694 | 303,873	| 300,024 |
| 100000 | 1000000 |	291120 |	306,420 | 317,573 |
| 200000 | 1000000 |	318,696 |	304,327 | 301321 |

###Import use JDBC

| Chunk size | Record | Duration 1st (ms) | 2nd | 3rd |
| ------------- | ------------- |	------------- |	-------------	| ------------- |
| 10000 | 1000000 |	38,405 |	36,128	| 36,566 |
| 20000 | 1000000 |	36,364 |	34,913	| 36,225 |
| 200000 | 1000000 |	38,974 |	39,878	| 39,725 |
 
###Copy use Hibernate

| Chunk size | Page size | Record | Duration 1st (ms) | 2nd | 3rd |
| ------------- | ------------- |	------------- |	-------------	| ------------- | ------------- |
| 1500 | 3000 |	1000000 |	353,714	| 377,476 | 371,284 |
| 50000 | 100000 |	1000000 |	363,559	| 347,464 | 349,948 |

###Copy use JDBC
 Note: Basing on "Import use JDBC", we have gotten best chunk size for using that is 20000 
 
| Chunk size | Page size | Record | Duration 1st (ms) | 2nd | 3rd |
| ------------- | ------------- |	------------- |	-------------	| ------------- | ------------- |
| 20000 | 20000 |	1000000 |	33,958	| 32,273 | 32,678 |
| 20000 | 60000 |	1000000 |	36,150 | 33,811 | 34,380 |
| 20000 | 100000 |	1000000 |	41,423 | 33,739 | 35,239 |


Import and copy *7.000.000* records

###Import use JDBC

| Chunk size | Record | Duration 1st (ms) | 2nd | 3rd |
| ------------- | ------------- |	------------- |	-------------	| ------------- |
| 10000 | 1000000 |	253,310 |	255,283	| 284,127 |
| 20000 | 1000000 |	232,534 |	234,193	| 243,951 |
| 200000 | 1000000 |	239,140 |	33,785	| 276,402 |

###Copy use JDBC
 Note: Basing on "Import use JDBC", we have gotten best chunk size for using that is 20000
 
| Chunk size | Page size | Record | Duration 1st (ms) | 2nd | 3rd |
| ------------- | ------------- |	------------- |	-------------	| ------------- | ------------- |
| 20000 | 20000 |	1000000 |	288,895	| 272,205 | 220,194 |
| 20000 | 60000 |	1000000 |	231,902 | 214,511 | 218,284 |
| 20000 | 100000 |	1000000 |	241,023 | 223,739 | 224,976 |

## Conlusion 
After benchmark, we see the results of 1000000 records and 7000000 records that are almostly equivalent about executing time (In the 7000000  record, if it's in import/copy processing, it's almostly same with 100000 resord). Then we had get the best using size(s) for chunk size/page size that are 20000(chunk size) and 20000~60000(page size).
