def group = "jira-administrators"
def result = get('/rest/api/3/group?groupname=' + group).asObject(Map).body
logger.info ("result >> " + result)
result
