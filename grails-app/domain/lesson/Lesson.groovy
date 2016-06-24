package lesson

class Lesson {

    String name

    String content

    int lessonOrder

    Unit unit

    static mapping = {
        content type: 'text'
    }

    static constraints = {
    }
}
