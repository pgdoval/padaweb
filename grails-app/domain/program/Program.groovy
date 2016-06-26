package program

import pathway.Pathway
import pathway.PathwayInProgram
import unit.UnitPrecedence

class Program {

    static hasMany = [pathways:PathwayInProgram, unitPrecedences: UnitPrecedence]

    String name


    static constraints = {
    }
}
