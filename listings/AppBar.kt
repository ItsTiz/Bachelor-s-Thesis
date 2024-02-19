hPanel(
    FlexWrap.NOWRAP,
    JustifyContent.CENTER,
    AlignItems.FLEXSTART,
    spacing = 5,

) {
    background = Background(color = Color.name(Col.LIGHTGRAY))

    add(
        SimulationContext(className = "simulation-context").apply {
            width = 1400.px
            height = 900.px
        },
    )

    vPanel(
        JustifyContent.START,
        AlignItems.CENTER,
        spacing = 5,
    ) {
        width = 520.px
        height = 95.perc
        marginTop = 12.px
        add(
            SimulationIndicators(className = "simulation-indicators").apply {
                width = 100.perc
                height = 100.perc
            },
        )
        add(
            NodeProperties(className = "node-properties").apply {
                width = 100.perc
                height = 100.perc
            },
        )
    }
}