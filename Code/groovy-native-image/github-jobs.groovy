import groovy.json.JsonSlurper

def jobsUrl = "https://jobs.github.com/positions.json?description=groovy"

def json = new JsonSlurper().parse(jobsUrl.toURL()) as List<Map>


json.each {

    println ("\n" + "=" * 42 )
    println ("Title" +  it.title)
    println ("Location" + it.location)
    println "Company ${it.company}"
    println ("Created at" + it.created_at)
    println ("URL: " + it.url)
    println ("=" * 42)
}