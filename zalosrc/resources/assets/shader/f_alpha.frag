varying highp vec2 textureCoordinate1;
varying highp vec2 textureCoordinate2;

uniform sampler2D inputImageTexture1;
uniform sampler2D inputImageTexture2;

void main()
{
    mediump vec4 base = texture2D(inputImageTexture1, textureCoordinate1);
    mediump vec4 overlay = texture2D(inputImageTexture2, textureCoordinate2);
    mediump vec4 out_texture;

    mediump float aux_alpha = overlay.a;

    out_texture.a = aux_alpha + base.a - aux_alpha * base.a;

    if (out_texture.a != 0.0) {
        mediump float aux_weight = aux_alpha / out_texture.a;
        mediump float in_weight = 1.0 - aux_weight;
        out_texture.rgb = overlay.rgb * aux_weight + base.rgb * in_weight;
    } else {
        out_texture = base;
    }

    gl_FragColor = out_texture;
}