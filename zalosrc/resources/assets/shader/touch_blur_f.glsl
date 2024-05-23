precision lowp float;

uniform float aRadius;
uniform vec2 aLeftTop;
uniform vec2 aRightBot;
uniform vec2 aTouchPosition;
uniform sampler2D inputImageTexture;
varying vec2 textureCoordinate;

void main() {
    float x = gl_FragCoord.x;
    float y = gl_FragCoord.y;
    if (x >= aLeftTop.x && y >= aLeftTop.y && x <= aRightBot.x && y <= aRightBot.y) {
        float dist = distance(aTouchPosition, gl_FragCoord.xy);
        if (dist <= aRadius)
            gl_FragColor = texture2D(inputImageTexture, textureCoordinate);
    }
}