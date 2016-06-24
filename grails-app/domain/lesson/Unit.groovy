package lesson

class Unit extends LessonCollection{

    Pathway pathway

    String name

    String description

    int unitOrder

    static belongsTo = LessonCollection

    static hasMany = [lessons : Lesson, precededBy : LessonCollection]

    static constraints = {
    }
}
