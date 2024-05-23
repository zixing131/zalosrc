#extension GL_OES_EGL_image_external : require

precision mediump float;

uniform samplerExternalOES inputImageTexture;
varying vec2 textureCoordinate;

uniform mediump float opacity;

void main() {
    vec4 base = texture2D(inputImageTexture, textureCoordinate);
	gl_FragColor = vec4(base.rgb, opacity * base.a);
}