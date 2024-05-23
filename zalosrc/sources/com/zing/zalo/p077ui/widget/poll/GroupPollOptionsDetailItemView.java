package com.zing.zalo.p077ui.widget.poll;

import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import au.C2343e;
import com.androidquery.util.AbstractC3972e;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalocore.CoreUtility;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import me0.C23278z2;
import p348mi.C23302b;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import vg.C28203u6;

/* loaded from: classes6.dex */
public class GroupPollOptionsDetailItemView extends View {

    /* renamed from: A */
    static Drawable f70917A;

    /* renamed from: B */
    static TextPaint f70918B;

    /* renamed from: w */
    static final int f70919w = AbstractC23136l9.m118742r(36.0f);

    /* renamed from: x */
    static final int f70920x = AbstractC23136l9.m118742r(10.0f);

    /* renamed from: y */
    static final int f70921y = AbstractC23136l9.m118742r(16.0f);

    /* renamed from: z */
    static final int f70922z = AbstractC23136l9.m118742r(36.0f);

    /* renamed from: p */
    StaticLayout f70923p;

    /* renamed from: q */
    ContactProfile f70924q;

    /* renamed from: r */
    int f70925r;

    /* renamed from: s */
    int f70926s;

    /* renamed from: t */
    Drawable f70927t;

    /* renamed from: u */
    C23528a f70928u;

    /* renamed from: v */
    C3977j f70929v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.poll.GroupPollOptionsDetailItemView$a */
    /* loaded from: classes6.dex */
    public class C13706a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f70930l1;

        C13706a(String str) {
            this.f70930l1 = str;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                if (!str.equals(this.f70930l1)) {
                    return;
                }
                if (c3979l != null) {
                    if (c3979l.m18839c() != null) {
                        if (c3979l.m18839c().getWidth() == 1) {
                            if (c3979l.m18839c().getHeight() != 1) {
                            }
                        }
                        C3977j c3977j = GroupPollOptionsDetailItemView.this.f70929v;
                        if (c3977j != null) {
                            c3977j.setImageInfo(c3979l, false);
                        }
                        GroupPollOptionsDetailItemView.this.f70927t = new BitmapDrawable(GroupPollOptionsDetailItemView.this.getResources(), c3979l.m18839c());
                    }
                }
                GroupPollOptionsDetailItemView.this.invalidate();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.poll.GroupPollOptionsDetailItemView$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC13707b {
    }

    /* renamed from: a */
    void m76615a() {
        int i11 = this.f70925r;
        int i12 = f70920x;
        this.f70923p = AbstractC23214t.m119625l(this.f70924q.m40383Q(true, true), f70918B, (((i11 - i12) - f70919w) - f70921y) - i12, 1);
    }

    /* renamed from: b */
    void m76616b() {
        try {
            AbstractC3972e.m18781f0(this.f70929v);
            this.f70927t = f70917A;
            String str = this.f70924q.f42446v;
            if (!TextUtils.isEmpty(str)) {
                if (C23302b.f113247a.m120523d(str) && !CoreUtility.f89233i.equals(this.f70924q.f42434r)) {
                    ContactProfile contactProfile = this.f70924q;
                    String str2 = contactProfile.f42434r;
                    String m40383Q = contactProfile.m40383Q(true, false);
                    int m12307a = C2343e.m12307a(str2, false);
                    this.f70927t = C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(m40383Q), m12307a);
                } else {
                    ((C23528a) this.f70928u.m123612r(this.f70929v)).m123579C(str, C23278z2.m120143n(), new C13706a(str));
                }
            }
            invalidate();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        try {
            Drawable drawable = this.f70927t;
            if (drawable != null) {
                int i11 = f70920x;
                int i12 = f70919w;
                drawable.setBounds(i11, 0, i11 + i12, i12);
                this.f70927t.draw(canvas);
            }
            if (this.f70923p != null) {
                canvas.save();
                canvas.translate(f70920x + f70919w + f70921y, (f70922z / 2) - (this.f70923p.getHeight() / 2));
                this.f70923p.draw(canvas);
                canvas.restore();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        setMeasuredDimension(View.MeasureSpec.getSize(i11), f70922z);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (i11 > 0 && i12 > 0) {
            if (i11 != this.f70925r || i12 != this.f70926s) {
                this.f70925r = i11;
                this.f70926s = i12;
                if (this.f70924q != null) {
                    m76615a();
                }
            }
        }
    }

    public void setData(String str) {
        try {
            ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
            this.f70924q = m141809c;
            if (m141809c != null) {
                if (this.f70925r > 0 && this.f70926s > 0) {
                    m76615a();
                }
                m76616b();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setListener(InterfaceC13707b interfaceC13707b) {
    }
}
