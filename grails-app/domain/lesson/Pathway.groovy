package lesson

import program.Program

class Pathway extends LessonCollection{

    Program program

    String name
    String description

    static hasMany = [ units: Unit]

    static constraints = {
    }
}
