varying highp vec2 textureCoordinate1;
varying highp vec2 textureCoordinate2;

uniform sampler2D inputImageTexture1;
uniform sampler2D inputImageTexture2;

void main()
{
    mediump vec4 base = texture2D(inputImageTexture1, textureCoordinate1);
    mediump vec4 overlay = texture2D(inputImageTexture2, textureCoordinate2);
    mediump vec3 out_texture;

    mediump float comp_alpha = min(base.a, overlay.a);
    mediump float new_alpha = base.a + (1.0 - base.a) * comp_alpha;

    if (comp_alpha != 0.0 && new_alpha != 0.0) {
        mediump float ratio = comp_alpha / new_alpha;
        out_texture = max(overlay.rgb, base.rgb) * ratio + base.rgb * (1.0 - ratio);
    } else {
        out_texture = base.rgb;
    }

    gl_FragColor = vec4(out_texture, base.a);

//    gl_FragColor = vec4(1.0, 0.0, 0.0, 1.0);
}