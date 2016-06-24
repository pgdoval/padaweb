package lesson

class Exercise {

    static belongsTo = LessonCollection
    static hasMany = [environments : LessonCollection]

    boolean mandatory

    String formulation


    static mapping = {
        formulation type: 'text'
    }

    static constraints = {
    }
}
