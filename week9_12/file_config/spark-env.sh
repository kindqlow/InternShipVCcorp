export SPARK_MASTER_PORT=7079
export SPARK_HOME=/home/hdfs2/spark-2.4.8
export HADOOP_CONF_DIR=$HADOOP_HOME/etc/hadoop
export YARN_CONF_DIR=$HADOOP_HOME/etc/hadoop
export SPARK_WORKER_DIR=/home/hdfs2/spark-2.4.8/work
export SPARK_LOG_DIR=/home/hdfs2/spark-2.4.8/log
export SPARK_MASTER_ID=10.5.94.234

#export SPARK_SSH_OPTS="-p 2395"
export SPARK_SSH_OPTS="-o BatchMode=yes -o StrictHostKeyChecking=no -o ConnectTimeout=10s -p 2395"
