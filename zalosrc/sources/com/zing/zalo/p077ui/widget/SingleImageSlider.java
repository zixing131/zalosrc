package com.zing.zalo.p077ui.widget;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import cg.AbstractC3460h;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.data.mediapicker.model.VideoItem;
import java.util.ArrayList;
import me0.AbstractC23136l9;
import me0.AbstractC23280z4;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;

/* loaded from: classes6.dex */
public class SingleImageSlider extends View implements InterfaceC13634f2 {

    /* renamed from: K */
    static final int f69591K = AbstractC23136l9.m118742r(6.0f);

    /* renamed from: L */
    static final int f69592L = AbstractC23136l9.m118742r(2.0f);

    /* renamed from: A */
    C13704p1 f69593A;

    /* renamed from: B */
    InterfaceC13721r0 f69594B;

    /* renamed from: C */
    String f69595C;

    /* renamed from: D */
    RectF f69596D;

    /* renamed from: E */
    float f69597E;

    /* renamed from: F */
    boolean f69598F;

    /* renamed from: G */
    int f69599G;

    /* renamed from: H */
    float f69600H;

    /* renamed from: I */
    float f69601I;

    /* renamed from: J */
    boolean f69602J;

    /* renamed from: p */
    final int f69603p;

    /* renamed from: q */
    final int f69604q;

    /* renamed from: r */
    final int f69605r;

    /* renamed from: s */
    final int f69606s;

    /* renamed from: t */
    ArrayList f69607t;

    /* renamed from: u */
    C23528a f69608u;

    /* renamed from: v */
    C3977j f69609v;

    /* renamed from: w */
    C13697o f69610w;

    /* renamed from: x */
    RectF f69611x;

    /* renamed from: y */
    Paint f69612y;

    /* renamed from: z */
    Paint f69613z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.SingleImageSlider$a */
    /* loaded from: classes6.dex */
    public class C13527a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f69614l1;

        /* renamed from: m1 */
        final /* synthetic */ boolean f69615m1;

        C13527a(String str, boolean z11) {
            this.f69614l1 = str;
            this.f69615m1 = z11;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            Bitmap m18839c;
            try {
                if (!TextUtils.isEmpty(this.f69614l1) && str.equals(this.f69614l1)) {
                    C3977j c3977j = SingleImageSlider.this.f69609v;
                    if (c3977j != null) {
                        c3977j.setImageInfo(c3979l, false);
                    }
                    if (c3979l != null && (m18839c = c3979l.m18839c()) != null && m18839c.getWidth() != 1 && m18839c.getHeight() != 1) {
                        SingleImageSlider.this.f69610w.m76480u(m18839c, this.f69615m1);
                        SingleImageSlider.this.invalidate();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    void m75883a(String str, boolean z11) {
        try {
            ((C23528a) this.f69608u.m123612r(this.f69609v)).m123579C(str, C23278z2.m120068F(), new C13527a(str, z11));
            invalidate();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    void m75884b() {
        if (this.f69607t.size() == 0) {
            return;
        }
        int i11 = this.f69599G - 1;
        this.f69599G = i11;
        if (i11 < 0) {
            this.f69599G = this.f69607t.size() - 1;
        }
        m75886d((MediaItem) this.f69607t.get(this.f69599G), true);
    }

    /* renamed from: c */
    void m75885c() {
        int i11 = this.f69599G;
        if (i11 >= 0 && i11 < this.f69607t.size()) {
            return;
        }
        m75886d((MediaItem) this.f69607t.get(this.f69599G), false);
    }

    /* renamed from: d */
    void m75886d(MediaItem mediaItem, boolean z11) {
        try {
            if (mediaItem instanceof VideoItem) {
                String m17440h = AbstractC3460h.m17440h(((VideoItem) mediaItem).m41213t1());
                this.f69595C = m17440h;
                int m118764y0 = AbstractC23136l9.m118764y0(this.f69593A, m17440h);
                int m118761x0 = AbstractC23136l9.m118761x0(this.f69593A, this.f69595C);
                RectF rectF = this.f69596D;
                int i11 = f69591K;
                int i12 = f69592L;
                rectF.set(i11, i11, m118764y0 + i11 + (i12 * 2), i11 + m118761x0 + (i12 * 2));
                this.f69597E = this.f69596D.height() / 2.0f;
            } else {
                this.f69595C = null;
            }
            m75883a(AbstractC23280z4.m120292D(mediaItem), z11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public ArrayList<MediaItem> getData() {
        return this.f69607t;
    }

    @Override // com.zing.zalo.p077ui.widget.InterfaceC13634f2
    public void next() {
        if (this.f69607t.size() == 0) {
            return;
        }
        int size = (this.f69599G + 1) % this.f69607t.size();
        this.f69599G = size;
        m75886d((MediaItem) this.f69607t.get(size), true);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.save();
        canvas.rotate(5.0f, this.f69603p + (this.f69611x.width() / 2.0f), this.f69604q + (this.f69611x.height() / 2.0f));
        canvas.translate(this.f69603p, this.f69604q);
        RectF rectF = this.f69611x;
        int i11 = this.f69605r;
        canvas.drawRoundRect(rectF, i11, i11, this.f69612y);
        canvas.restore();
        this.f69610w.m76467d(canvas);
        if (!TextUtils.isEmpty(this.f69595C)) {
            RectF rectF2 = this.f69596D;
            float f11 = this.f69597E;
            canvas.drawRoundRect(rectF2, f11, f11, this.f69613z);
            String str = this.f69595C;
            RectF rectF3 = this.f69596D;
            float f12 = rectF3.left;
            int i12 = f69592L;
            canvas.drawText(str, f12 + i12, rectF3.bottom - i12, this.f69593A);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        if (getParent() != null) {
                            getParent().requestDisallowInterceptTouchEvent(false);
                        }
                        this.f69598F = false;
                        InterfaceC13721r0 interfaceC13721r0 = this.f69594B;
                        if (interfaceC13721r0 != null) {
                            interfaceC13721r0.mo75833e();
                        }
                    }
                } else if (!this.f69602J) {
                    float x11 = motionEvent.getX() - this.f69600H;
                    if (Math.abs(x11) >= this.f69606s) {
                        this.f69602J = true;
                        if (x11 < 0.0f) {
                            next();
                        } else {
                            m75884b();
                        }
                    }
                }
            } else {
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                this.f69598F = false;
                if (this.f69594B != null) {
                    if (!this.f69602J) {
                        float x12 = motionEvent.getX() - this.f69600H;
                        float y11 = motionEvent.getY() - this.f69601I;
                        if (Math.abs(x12) <= this.f69606s && Math.abs(y11) <= this.f69606s) {
                            this.f69594B.mo75832c();
                        }
                    }
                    this.f69594B.mo75833e();
                }
            }
        } else {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            this.f69600H = motionEvent.getX();
            this.f69601I = motionEvent.getY();
            this.f69598F = true;
            this.f69602J = false;
            InterfaceC13721r0 interfaceC13721r02 = this.f69594B;
            if (interfaceC13721r02 != null) {
                interfaceC13721r02.mo75831a();
            }
        }
        return this.f69598F;
    }

    public void setData(ArrayList<MediaItem> arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.f69607t = arrayList;
        if (this.f69599G >= 0) {
            m75885c();
        } else {
            next();
        }
    }

    public void setInteractionListener(InterfaceC13721r0 interfaceC13721r0) {
        this.f69594B = interfaceC13721r0;
    }
}
