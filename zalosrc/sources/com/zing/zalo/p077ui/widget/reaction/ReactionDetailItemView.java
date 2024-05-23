package com.zing.zalo.p077ui.widget.reaction;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.p077ui.widget.C13658k;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.p077ui.widget.custom.DrawableCallbackView;
import gw.AbstractC19646n0;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import ph.C24753f;
import vg.C28203u6;

/* loaded from: classes6.dex */
public class ReactionDetailItemView extends DrawableCallbackView {

    /* renamed from: M */
    static Drawable f71085M;

    /* renamed from: N */
    static C13704p1 f71086N;

    /* renamed from: O */
    static C13704p1 f71087O;

    /* renamed from: P */
    static TextPaint f71088P;

    /* renamed from: Q */
    static C13704p1 f71089Q;

    /* renamed from: R */
    static C13704p1 f71090R;

    /* renamed from: A */
    C3977j f71092A;

    /* renamed from: B */
    C24753f f71093B;

    /* renamed from: C */
    boolean f71094C;

    /* renamed from: D */
    ReactionDetailItemView f71095D;

    /* renamed from: q */
    final int f71096q;

    /* renamed from: r */
    StaticLayout f71097r;

    /* renamed from: s */
    StaticLayout f71098s;

    /* renamed from: t */
    StaticLayout f71099t;

    /* renamed from: u */
    ContactProfile f71100u;

    /* renamed from: v */
    int f71101v;

    /* renamed from: w */
    int f71102w;

    /* renamed from: x */
    protected C13658k f71103x;

    /* renamed from: y */
    C23528a f71104y;

    /* renamed from: z */
    boolean f71105z;

    /* renamed from: E */
    static final int f71077E = AbstractC23136l9.m118742r(15.0f);

    /* renamed from: F */
    static final int f71078F = AbstractC23136l9.m118742r(48.0f);

    /* renamed from: G */
    static final int f71079G = AbstractC23136l9.m118742r(12.0f);

    /* renamed from: H */
    static final int f71080H = AbstractC23136l9.m118742r(60.0f);

    /* renamed from: I */
    static final int f71081I = AbstractC23136l9.m118742r(21.0f);

    /* renamed from: J */
    static final int f71082J = AbstractC23136l9.m118742r(49.0f);

    /* renamed from: K */
    static final int f71083K = AbstractC23136l9.m118742r(16.0f);

    /* renamed from: L */
    static final int f71084L = AbstractC23136l9.m118742r(6.0f);

    /* renamed from: S */
    static int f71091S = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.reaction.ReactionDetailItemView$a */
    /* loaded from: classes6.dex */
    public class C13742a extends C23999j {
        C13742a() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            Bitmap m18839c;
            try {
                if (!str.equals(ReactionDetailItemView.this.f71100u.f42446v)) {
                    return;
                }
                C3977j c3977j = ReactionDetailItemView.this.f71092A;
                if (c3977j != null) {
                    c3977j.setImageInfo(c3979l, false);
                }
                if (c3979l != null && (m18839c = c3979l.m18839c()) != null) {
                    if (m18839c.getWidth() != 1 || m18839c.getHeight() != 1) {
                        ReactionDetailItemView reactionDetailItemView = ReactionDetailItemView.this;
                        reactionDetailItemView.f71105z = true;
                        reactionDetailItemView.f71103x.m76334m(m18839c, true);
                        ReactionDetailItemView.this.f71095D.invalidate();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.reaction.ReactionDetailItemView$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC13743b {
    }

    /* renamed from: a */
    public static void m76790a(int i11) {
        if (f71091S != i11) {
            f71091S = i11;
            m76791b();
        }
    }

    /* renamed from: b */
    private static void m76791b() {
        f71085M = null;
    }

    /* renamed from: c */
    void m76792c() {
        C13704p1 c13704p1;
        C13704p1 c13704p12;
        try {
            String m102954a0 = AbstractC19646n0.m102954a0(this.f71093B.m128594g());
            if (this.f71094C) {
                c13704p1 = f71089Q;
            } else {
                c13704p1 = f71090R;
            }
            this.f71098s = AbstractC23214t.m119624k(m102954a0, c13704p1, this.f71096q);
            int i11 = this.f71101v;
            int i12 = f71083K;
            int i13 = ((i11 - i12) - f71078F) - f71079G;
            int lineWidth = (int) (((((i13 - r2) - this.f71097r.getLineWidth(0)) - f71084L) - this.f71096q) - i12);
            String m40383Q = this.f71100u.m40383Q(true, true);
            if (this.f71094C) {
                c13704p12 = f71086N;
            } else {
                c13704p12 = f71087O;
            }
            this.f71099t = AbstractC23214t.m119625l(m40383Q, c13704p12, lineWidth, 1);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: d */
    void m76793d() {
        try {
            String str = this.f71100u.f42446v;
            if (!TextUtils.isEmpty(str)) {
                C24003n m120143n = C23278z2.m120143n();
                C3979l m125755z2 = C23999j.m125755z2(str, m120143n.f116260a, m120143n.f116264e, m120143n.f116266g);
                if (m125755z2 != null) {
                    this.f71105z = true;
                    C3977j c3977j = this.f71092A;
                    if (c3977j != null) {
                        c3977j.setImageInfo(m125755z2, false);
                    }
                    this.f71103x.m76334m(m125755z2.m18839c(), false);
                    this.f71095D.invalidate();
                    return;
                }
                this.f71103x.m76331h();
                ((C23528a) this.f71104y.m123612r(this.f71092A)).m123579C(str, m120143n, new C13742a());
                return;
            }
            this.f71103x.m76331h();
            this.f71095D.invalidate();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        try {
            if (this.f71094C) {
                canvas.drawColor(452306467);
            }
            if (this.f71105z) {
                this.f71103x.m76325a(canvas);
            } else if (f71085M != null) {
                canvas.save();
                canvas.translate(f71083K, f71084L);
                f71085M.draw(canvas);
                canvas.restore();
            }
            if (this.f71094C) {
                canvas.save();
                float f11 = f71082J;
                int i11 = f71084L + f71078F;
                int i12 = f71081I;
                canvas.translate(f11, i11 - i12);
                AbstractC11531v0.m62311q3().setBounds(0, 0, i12, i12);
                AbstractC11531v0.m62311q3().draw(canvas);
                canvas.restore();
            }
            if (this.f71099t != null) {
                canvas.save();
                canvas.translate(f71083K + f71078F + f71079G, (f71080H / 2) - (this.f71099t.getHeight() / 2));
                this.f71099t.draw(canvas);
                canvas.restore();
            }
            int width = (this.f71095D.getWidth() - this.f71096q) - f71083K;
            if (this.f71097r != null) {
                canvas.save();
                canvas.translate((width - f71084L) - this.f71097r.getLineWidth(0), (f71080H / 2) - (this.f71097r.getHeight() / 2));
                this.f71097r.draw(canvas);
                canvas.restore();
            }
            if (this.f71098s != null) {
                canvas.save();
                canvas.translate(width, (f71080H / 2) - (this.f71098s.getHeight() / 2));
                this.f71098s.draw(canvas);
                canvas.restore();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        setMeasuredDimension(View.MeasureSpec.getSize(i11), f71080H);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (i11 > 0 && i12 > 0) {
            if (i11 != this.f71101v || i12 != this.f71102w) {
                this.f71101v = i11;
                this.f71102w = i12;
                if (this.f71100u != null) {
                    m76792c();
                }
            }
        }
    }

    public void setData(C24753f c24753f) {
        try {
            this.f71105z = false;
            this.f71093B = c24753f;
            this.f71097r = AbstractC23214t.m119632s(c24753f.m128596i(), f71088P, Integer.MAX_VALUE);
            ContactProfile m141809c = C28203u6.f131407a.m141809c(String.valueOf(c24753f.m128601n()));
            this.f71100u = m141809c;
            if (m141809c != null) {
                if (this.f71101v > 0 && this.f71102w > 0) {
                    m76792c();
                }
                m76793d();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    public void setIsSpecial(boolean z11) {
        this.f71094C = z11;
    }

    public void setListener(InterfaceC13743b interfaceC13743b) {
    }
}
