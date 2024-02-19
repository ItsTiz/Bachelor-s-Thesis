sealed class NodeStateAction: RAction {

    data class SetNode(val node: NodeQuery.Data?): NodeStateAction()

}