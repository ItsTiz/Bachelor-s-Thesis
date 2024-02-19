fun nodeReducer(state: NodeState, action: NodeStateAction): NodeState {
    when (action) {
        is NodeStateAction.SetNode -> {
            return state.copy(node = action.node)
        }
    }
}