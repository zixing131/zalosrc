//precision mediump float;

uniform sampler2D sTexture;
varying vec2 v_texCoord;

void main(){
	gl_FragColor = texture2D(sTexture, v_texCoord);

	//vec4 v_orColor = v_fragmentColor * texture2D(CC_Texture0, v_texCoord);
        //float gray = dot(v_orColor.rgb, vec3(0.299, 0.587, 0.114));
//        gl_FragColor = vec4(1.0, 0.0, 0.0, 1.0);
}