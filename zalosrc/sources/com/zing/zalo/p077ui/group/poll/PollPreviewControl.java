package com.zing.zalo.p077ui.group.poll;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import au.C2343e;
import com.androidquery.util.AbstractC3972e;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.widget.custom.DrawableCallbackView;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalocore.CoreUtility;
import h70.AbstractC19907a;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23278z2;
import p304ks.AbstractC21935u;
import p348mi.C23302b;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p716zh.C31961i8;

/* loaded from: classes5.dex */
public class PollPreviewControl extends DrawableCallbackView {

    /* renamed from: q */
    final C3977j f62412q;

    /* renamed from: r */
    C11996a f62413r;

    /* renamed from: s */
    boolean f62414s;

    /* renamed from: t */
    C23528a f62415t;

    /* renamed from: u */
    Drawable f62416u;

    /* renamed from: v */
    C16640q2 f62417v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.group.poll.PollPreviewControl$a */
    /* loaded from: classes5.dex */
    public class C11995a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f62418l1;

        C11995a(String str) {
            this.f62418l1 = str;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                if (TextUtils.equals(str, this.f62418l1)) {
                    if (c3979l == null || c3979l.m18839c() == null || (c3979l.m18839c().getWidth() == 1 && c3979l.m18839c().getHeight() == 1)) {
                        PollPreviewControl pollPreviewControl = PollPreviewControl.this;
                        pollPreviewControl.f62413r.f62446B0 = pollPreviewControl.f62416u;
                        PollPreviewControl.this.invalidate();
                    }
                    C3977j c3977j = PollPreviewControl.this.f62412q;
                    if (c3977j != null) {
                        c3977j.setImageInfo(c3979l, false);
                    }
                    if (c23995f.m125666q() == 4) {
                        PollPreviewControl.this.f62413r.f62446B0 = new BitmapDrawable(AbstractC23136l9.m118698c0(), c3979l.m18839c());
                    } else {
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(AbstractC23136l9.m118698c0(), c3979l.m18839c());
                        PollPreviewControl pollPreviewControl2 = PollPreviewControl.this;
                        pollPreviewControl2.f62413r.f62446B0 = new TransitionDrawable(new Drawable[]{pollPreviewControl2.f62416u, bitmapDrawable});
                        PollPreviewControl pollPreviewControl3 = PollPreviewControl.this;
                        pollPreviewControl3.f62413r.f62446B0.setCallback(pollPreviewControl3);
                        ((TransitionDrawable) PollPreviewControl.this.f62413r.f62446B0).setCrossFadeEnabled(true);
                        ((TransitionDrawable) PollPreviewControl.this.f62413r.f62446B0).startTransition(100);
                    }
                    PollPreviewControl.this.invalidate();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public PollPreviewControl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f62414s = false;
        C11996a c11996a = new C11996a(this);
        this.f62413r = c11996a;
        c11996a.m66626j(AbstractC23136l9.m118742r(8.0f));
        this.f62413r.m66628l(true);
        this.f62415t = new C23528a(context);
        this.f62416u = C23278z2.m120143n().f116261b;
        this.f62412q = new C3977j(context);
    }

    /* renamed from: a */
    void m66613a(String str, String str2) {
        try {
            AbstractC3972e.m18781f0(this.f62412q);
            this.f62413r.f62446B0 = this.f62416u;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (C23302b.f113247a.m120523d(str) && !CoreUtility.f89233i.equals(str2)) {
                ContactProfile m118084d = AbstractC23028c0.m118084d(str2);
                if (m118084d != null) {
                    int m12307a = C2343e.m12307a(str2, false);
                    C16640q2 mo88412f = C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(AbstractC21935u.m114542i(m118084d.f42434r, m118084d.m40383Q(true, false))), m12307a);
                    this.f62417v = mo88412f;
                    this.f62413r.f62446B0 = mo88412f;
                }
            } else if (!this.f62414s || C23999j.m125696L2(str, C23278z2.m120143n())) {
                ((C23528a) this.f62415t.m123612r(this.f62412q)).m123579C(str, C23278z2.m120143n(), new C11995a(str));
            }
            invalidate();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public void m66614b(C31961i8 c31961i8, boolean z11, boolean z12) {
        this.f62413r.m66629m(z11);
        this.f62413r.m66625i(c31961i8, false);
        this.f62413r.m66627k(AbstractC23222t7.f112566j, 0);
        this.f62414s = z12;
        m66613a(c31961i8.f146886g, c31961i8.f146884e);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f62413r.m66619c(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        if (this.f62413r != null) {
            setMeasuredDimension(View.MeasureSpec.getSize(i11), this.f62413r.f62493g);
        } else {
            super.onMeasure(i11, i12);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        invalidate();
        return this.f62413r.m66623g(motionEvent.getAction(), motionEvent.getX(), motionEvent.getY());
    }

    public void setChatPollViewListener(AbstractC19907a abstractC19907a) {
        this.f62413r.m66624h(abstractC19907a);
    }
}
