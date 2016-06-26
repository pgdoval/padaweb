package unit

import program.Program

/**
 * Created by pablo on 26/06/16.
 */
abstract class UnitPredecessor {

    abstract Program getProgram()

    List<Unit> getDirectlyPrecededUnits(){
        Unit.findAllByProgram(this.getProgram()).findAll{
            it.precededBy.contains(this)
        }
    }

    static mapping = {
        tablePerHierarchy false
    }
}