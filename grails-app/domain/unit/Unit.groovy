package unit

import lesson.ExerciseContainer
import lesson.LessonCollection
import lesson.UnitPartInUnit
import program.Program

class Unit extends UnitPredecessor implements ExerciseContainer{

    String name

    String description

    static belongsTo = LessonCollection

    static hasMany = [parts: UnitPartInUnit]

    static constraints = {
    }

    @Override
    Program getProgram() {
        pathway.program
    }
}
