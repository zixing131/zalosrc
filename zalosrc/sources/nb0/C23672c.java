package nb0;

import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.uidrawing.C16719g;
import kd0.C21697g;
import vg.C28202u5;

/* renamed from: nb0.c */
/* loaded from: classes6.dex */
public class C23672c extends C10866e {

    /* renamed from: g0 */
    public final C28202u5 f114678g0;

    /* renamed from: h0 */
    boolean f114679h0 = false;

    /* renamed from: i0 */
    boolean f114680i0 = true;

    public C23672c(C28202u5 c28202u5, int i11, int i12) {
        this.f114678g0 = c28202u5;
        this.f54862y = i11;
        this.f54863z = i12;
    }

    @Override // com.zing.zalo.social.controls.C10866e
    /* renamed from: E */
    public void mo50126E(View view) {
        Selection.setSelection((Spannable) ((TextView) view).getText(), 0);
        if (m56391h() != null) {
            m56391h().mo43565wo(this, this.f54853p);
        }
    }

    @Override // com.zing.zalo.social.controls.C10866e
    /* renamed from: F */
    public void mo56362F(C16719g c16719g) {
        Selection.setSelection((Spannable) ((C21697g) c16719g).m111973m1(), 0);
        if (m56391h() != null) {
            m56391h().mo43565wo(this, this.f54853p);
        }
    }

    /* renamed from: j0 */
    public void m124005j0(boolean z11) {
        this.f114679h0 = z11;
    }

    /* renamed from: k0 */
    public void m124006k0(boolean z11) {
        this.f114680i0 = z11;
    }

    @Override // com.zing.zalo.social.controls.C10866e, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        updateMeasureState(textPaint);
        C28202u5 c28202u5 = this.f114678g0;
        if (c28202u5 != null && this.f114680i0) {
            textPaint.setColor(c28202u5.f131405c);
        }
        textPaint.setUnderlineText(this.f114679h0);
    }

    @Override // com.zing.zalo.social.controls.C10866e, android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        C28202u5 c28202u5 = this.f114678g0;
        if (c28202u5 != null && c28202u5.f131406d && !this.f114679h0) {
            textPaint.setFakeBoldText(true);
        }
    }
}
