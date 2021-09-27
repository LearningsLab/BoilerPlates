## Low Level Designs of Various Sub Systems

You can use the [editor on GitHub](https://github.com/mkumar9009/BoilerPlates/edit/gh-pages/index.md) to maintain and preview the content for your website in Markdown files.

### Design a Task Planner
```markdown


## Requirements
- User shall be able to create Task , Bugs and Story
- User shall be able to run a Sprint.
- Different Status flow shall be maintained based on Task/Bug/Story.

## Translation into Objects
- Task,bug and Story has attributes like start date,end date, AssignTo, Status, Description, Subject.
- Task, Bug and Story may have a Sprint or a project or both.
- Story can have tasks as well as bugs.
- User will have a role like Admin and other roles are also posiible
- Status Flow will have a predefined sequence to flow like for a task Coding to Coding to Testing is denied, Coding to Review and then Review to testing is allowed.


## Class Diagram Walk Through
1. Create an abstract class Tracker which contains common attributes for Task, Story and Bug
2. Using a Builder pattern to build a Task/Bug/Stroy
3. An Interface which maintains the ordered movement of status in task , bug and story.

**Bold** and _Italic_ and `Code` text

[Link](url) and ![Image](src)
```

