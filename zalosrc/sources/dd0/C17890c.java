package dd0;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.p077ui.chat.chatrow.ChatRow;
import com.zing.zalo.uicontrol.svg.C16654c;
import me0.AbstractC23136l9;

/* renamed from: dd0.c */
/* loaded from: classes4.dex */
public class C17890c extends Drawable {

    /* renamed from: a */
    private int f90401a;

    /* renamed from: b */
    private final C16654c f90402b;

    /* renamed from: c */
    private final RectF f90403c;

    /* renamed from: d */
    private float f90404d = 1.0f;

    /* renamed from: e */
    private final int f90405e = -1;

    /* renamed from: f */
    private final int f90406f = -1;

    public C17890c(C16654c c16654c) {
        this.f90401a = 0;
        this.f90402b = c16654c;
        this.f90401a = AbstractC23136l9.m118742r(27.0f);
        int i11 = this.f90401a;
        this.f90403c = new RectF(0.0f, 0.0f, i11, i11);
        int i12 = this.f90401a;
        setBounds(0, 0, i12, i12);
    }

    /* renamed from: a */
    public void m94434a(float f11) {
        float m62206U2 = AbstractC11531v0.m62206U2() - (ChatRow.f57203M5 * 2);
        if (f11 > m62206U2) {
            f11 = m62206U2;
        }
        this.f90404d = f11 / this.f90401a;
        int i11 = (int) f11;
        setBounds(0, 0, i11, i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        try {
            C16654c c16654c = this.f90402b;
            if (c16654c != null) {
                int i11 = this.f90401a;
                if (i11 > 0) {
                    RectF rectF = this.f90403c;
                    float f11 = this.f90404d;
                    rectF.right = i11 * f11;
                    rectF.bottom = i11 * f11;
                    Rect copyBounds = copyBounds();
                    canvas.translate(copyBounds.centerX() - (this.f90403c.right / 2.0f), copyBounds.centerY() - (this.f90403c.bottom / 2.0f));
                    this.f90402b.m88489j(canvas, this.f90403c);
                } else {
                    c16654c.m88488i(canvas);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
