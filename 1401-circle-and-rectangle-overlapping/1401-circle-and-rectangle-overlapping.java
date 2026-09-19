class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int closeX = clamp(xCenter, x1, x2);
        int closeY = clamp(yCenter, y1, y2);
        int distX = xCenter-closeX;
        int distY = yCenter-closeY;
        int sqDistance = distX*distX+distY*distY;
        return sqDistance <= radius*radius;
    }
    private int clamp(int val, int min, int max) {
        return Math.max(min, Math.min(val,max));
    }
}