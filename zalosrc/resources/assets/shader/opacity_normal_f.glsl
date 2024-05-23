precision mediump float;

uniform sampler2D inputImageTexture;
varying vec2 textureCoordinate;

uniform mediump float opacity;

void main() {
    vec4 base = texture2D(inputImageTexture, textureCoordinate);
	gl_FragColor = vec4(base.rgb, opacity * base.a);
}