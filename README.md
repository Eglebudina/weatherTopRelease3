# weatherTopRelease3 
assignment

#Play is a high-productivity Java and Scala web application framework that integrates 
the components and APIs you need for modern web application development.

To open the app, follwo these steps:
1. copy the github repo to your local computer
2. open your terminal and cd into the newly created app locally
3. to run play framework you may need to run the path in the terminal if you don't have the play framework installed: PATH=$PATH:$HOME/bin:/usr/local/bin:$HOME/dev/play-1.5.3
export PATH
4. next in the ternimal type: play idealize
5. open the app inside intelliJ IDEA or other alternative IDEA
6. in intelliJ application open a file conf/application.conf and make these changes: 
db.default=mem
#db=postgres://pxtvdjmb:FjUu4uBDeTEpAvK3DCeUKOG4wY6b8oiI@tai.db.elephantsql.com/pxtvdjmb
#pa.dialect=org.hibernate.dialect.PostgreSQLDialect
#jpa.ddl=update
(this action will remove the database connection so you can run the application locally)
7. next in the terminal type: play run
8. open local:9000 connection to see the app

