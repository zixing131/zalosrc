package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.core.content.res.AbstractC1398e;
import androidx.core.provider.AbstractC1460g;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import java.io.IOException;

/* renamed from: androidx.core.graphics.n */
/* loaded from: classes2.dex */
public class C1430n extends AbstractC1431o {
    /* renamed from: h */
    private Font m7290h(FontFamily fontFamily, int i11) {
        int i12;
        int i13;
        if ((i11 & 1) != 0) {
            i12 = IMediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING;
        } else {
            i12 = 400;
        }
        if ((i11 & 2) != 0) {
            i13 = 1;
        } else {
            i13 = 0;
        }
        FontStyle fontStyle = new FontStyle(i12, i13);
        Font font = fontFamily.getFont(0);
        int m7291i = m7291i(fontStyle, font.getStyle());
        for (int i14 = 1; i14 < fontFamily.getSize(); i14++) {
            Font font2 = fontFamily.getFont(i14);
            int m7291i2 = m7291i(fontStyle, font2.getStyle());
            if (m7291i2 < m7291i) {
                font = font2;
                m7291i = m7291i2;
            }
        }
        return font;
    }

    /* renamed from: i */
    private static int m7291i(FontStyle fontStyle, FontStyle fontStyle2) {
        int i11;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i11 = 0;
        } else {
            i11 = 2;
        }
        return abs + i11;
    }

    @Override // androidx.core.graphics.AbstractC1431o
    /* renamed from: a */
    public Typeface mo7269a(Context context, AbstractC1398e.c cVar, Resources resources, int i11) {
        try {
            FontFamily.Builder builder = null;
            for (AbstractC1398e.d dVar : cVar.m7059a()) {
                try {
                    Font build = new Font.Builder(resources, dVar.m7061b()).setWeight(dVar.m7064e()).setSlant(dVar.m7065f() ? 1 : 0).setTtcIndex(dVar.m7062c()).setFontVariationSettings(dVar.m7063d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(m7290h(build2, i11).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.AbstractC1431o
    /* renamed from: b */
    public Typeface mo7270b(Context context, CancellationSignal cancellationSignal, AbstractC1460g.b[] bVarArr, int i11) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (AbstractC1460g.b bVar : bVarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(bVar.m7411d(), "r", cancellationSignal);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor == null) {
                    }
                } else {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(bVar.m7412e()).setSlant(bVar.m7413f() ? 1 : 0).setTtcIndex(bVar.m7410c()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th2) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                        break;
                    }
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(m7290h(build2, i11).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.AbstractC1431o
    /* renamed from: d */
    public Typeface mo7281d(Context context, Resources resources, int i11, String str, int i12) {
        try {
            Font build = new Font.Builder(resources, i11).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.graphics.AbstractC1431o
    /* renamed from: g */
    public AbstractC1460g.b mo7292g(AbstractC1460g.b[] bVarArr, int i11) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
