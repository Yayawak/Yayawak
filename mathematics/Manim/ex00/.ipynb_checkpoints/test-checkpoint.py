from manim import *

# class CreateCircle(Scene):
class CircleToSquare(Scene):
    def construct(self):
        circle = Circle()
        circle.set_fill(PINK, opacity=.5)
        self.play(Create(circle))
