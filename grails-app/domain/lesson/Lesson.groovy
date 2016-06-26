package lesson

import unit.Unit

class Lesson extends UnitPart{

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
