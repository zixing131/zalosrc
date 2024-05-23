uniform mat4 CC_MVPMatrix;

attribute vec4 a_position;
attribute vec2 a_texCoord;
attribute vec2 a_texCoord1;

varying vec2 v_texCoord;
varying vec2 v_texCoord1;

void main()
{
    gl_Position = CC_MVPMatrix * a_position;
    v_texCoord = a_texCoord;
    v_texCoord1 = a_texCoord1;
}