def issue = Issues.getByKey("SUN-1038")
return "${issue.key}'s summary - ${issue.fields.summary}"
