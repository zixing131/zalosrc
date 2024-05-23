attribute vec4 a_position;
attribute vec2 a_texCoord;
attribute vec2 a_texCoord1;

//uniform mat4 textureMatrix;

varying vec2 v_texCoord;
varying vec2 v_texCoord1;

void main()
{
    gl_Position = CC_MVPMatrix * a_position;
    v_texCoord = a_texCoord;
    v_texCoord1 = a_texCoord1;


    //v_texCoord = a_texCoord + vec2(-0.5f, -0.5f);//vec2(texVec.x, texVec.y);
    //float uniformAngle = 270.0f * 0.0174532925f;
    //vec4 texVec = textureMatrix * vec4(v_texCoord.xy, 0, 0);
    //v_texCoord = texVec.xy;// + vec2(0.5f, 0.5f);
    //v_texCoord = mat2(cos(uniformAngle), sin(uniformAngle), -sin(uniformAngle), cos(uniformAngle)) * v_texCoord;
    //v_texCoord = v_texCoord + vec2(0.5f, 0.5f);
}