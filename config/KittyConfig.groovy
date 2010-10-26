server {
	host = 'localhost'
	port = 8080
}

log4j {
	appender.stdout = "org.apache.log4j.ConsoleAppender"
	appender."stdout.layout"="org.apache.log4j.PatternLayout"
	rootLogger="error,stdout"
}
