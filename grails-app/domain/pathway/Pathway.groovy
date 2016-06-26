package pathway

import lesson.Exercise
import lesson.ExerciseContainer
import program.Program
import unit.Unit
import unit.UnitPredecessor

class Pathway extends UnitPredecessor, ExerciseContainer{

    Program program

    String name
    String description

    static hasMany = [units: Unit, exercises: Exercise]

    static constraints = {
        program nullable: true
    }
}
