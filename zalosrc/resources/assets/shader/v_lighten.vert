attribute vec4 a_position;
attribute vec2 a_texCoord;
attribute vec2 a_texCoord1;

varying vec2 textureCoordinate1;
varying vec2 textureCoordinate2;

void main()
{
    gl_Position = CC_MVPMatrix * a_position;
    textureCoordinate1 = a_texCoord;
    textureCoordinate2 = a_texCoord1;

}