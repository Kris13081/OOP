package SOLID.p01_SingleResponsibility.p01_DrawingShape;

import SOLID.p02_OpenClosedPrinciple.p02_DrawingShape.interfaces.DrawingManager;
import SOLID.p01_SingleResponsibility.p01_DrawingShape.interfaces.DrawingRepository;
import SOLID.p01_SingleResponsibility.p01_DrawingShape.interfaces.Rengerer;
import SOLID.p01_SingleResponsibility.p01_DrawingShape.interfaces.Shape;


public class DrawingManagerImpl implements DrawingManager {

    private final DrawingRepository drawingRepository;
    private final Rengerer renderer;

    public DrawingManagerImpl(DrawingRepository drawingRepository, Rengerer renderer) {
        this.drawingRepository = drawingRepository;
        this.renderer = renderer;
    }


    @Override
    public void draw(Shape shape) {
        shape.draw(this.renderer, this.drawingRepository);
    }
}
