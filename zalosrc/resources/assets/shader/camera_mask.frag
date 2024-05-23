varying vec2 v_texCoord;
varying vec2 v_texCoord1;

uniform sampler2D sCamTexture;
uniform sampler2D maskTexture;

void main()
{
    vec4 mask_color = texture2D(maskTexture, v_texCoord1);
    if (mask_color.a > 0.0){
        gl_FragColor =  texture2D(sCamTexture, v_texCoord);
    } else {
        gl_FragColor =  vec4(0.0, 0.0, 0.0, 0.0);
    }
    //gl_FragColor = vec4(1.0, 0.0, 0.0, 1.0);
    //Get the pixel value at the current location from the built-in Cocos2d uniform "CC_Texture0"
    //vec4 v_orColor = v_fragmentColor * texture2D(CC_Texture0, v_texCoord);
    //float gray = dot(v_orColor.rgb, vec3(0.299, 0.587, 0.114));
    //gl_FragColor = vec4(gray, gray, gray, v_orColor.a);
}