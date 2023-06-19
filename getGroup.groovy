def issueKey = 'CLOUD-1'

def result = get('/rest/api/2/issue/' + issueKey)
        .header('Content-Type', 'application/json')
        .asObject(Map)
if (result.status == 200){
    return result.body.fields.summary
} else {
    return "Failed to find issue: Status: ${result.status} ${result.body}"
}

// def group = "jira-administrators"
// def result = get('/rest/api/3/group?groupname=' + group).asObject(Map).body
// logger.info ("result >> " + result)
// result
