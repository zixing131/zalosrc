package com.zing.zalo.p077ui.chat.widget.searchinline;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.media.ThumbnailUtils;
import android.view.MotionEvent;
import android.view.View;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.widget.C13658k;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p611wj.C29054b;
import p716zh.C31902e9;

/* loaded from: classes5.dex */
public class SearchRowBanner extends SearchRow implements View.OnTouchListener {

    /* renamed from: M */
    private static final int f61383M = AbstractC23136l9.m118742r(18.0f);

    /* renamed from: N */
    private static final int f61384N = AbstractC23136l9.m118742r(6.0f);

    /* renamed from: O */
    private static final int f61385O = AbstractC23136l9.m118742r(6.0f);

    /* renamed from: D */
    C31902e9 f61386D;

    /* renamed from: E */
    InterfaceC11803b f61387E;

    /* renamed from: F */
    C13658k f61388F;

    /* renamed from: G */
    Bitmap f61389G;

    /* renamed from: H */
    Rect f61390H;

    /* renamed from: I */
    C23528a f61391I;

    /* renamed from: J */
    C3977j f61392J;

    /* renamed from: K */
    boolean f61393K;

    /* renamed from: L */
    boolean f61394L;

    /* renamed from: com.zing.zalo.ui.chat.widget.searchinline.SearchRowBanner$a */
    /* loaded from: classes5.dex */
    public class C11802a extends C23999j {
        C11802a() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            Bitmap m18839c;
            try {
                C3977j c3977j = SearchRowBanner.this.f61392J;
                if (c3977j != null) {
                    c3977j.setImageInfo(c3979l, false);
                }
                if (c3979l != null && (m18839c = c3979l.m18839c()) != null) {
                    if (m18839c.getWidth() != 1 || m18839c.getHeight() != 1) {
                        SearchRowBanner.this.f61388F.m76334m(m18839c, true);
                        SearchRowBanner.this.invalidate();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.searchinline.SearchRowBanner$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC11803b {
        /* renamed from: a */
        void mo65622a(View view, C31902e9 c31902e9);

        /* renamed from: b */
        void mo65623b();
    }

    public SearchRowBanner(Context context) {
        super(context);
        this.f61392J = new C3977j(MainApplication.getAppContext());
        this.f61393K = false;
        this.f61394L = false;
        C13658k c13658k = new C13658k(this);
        this.f61388F = c13658k;
        c13658k.m76341t(3, AbstractC23136l9.m118722k0());
        this.f61388F.m76343v(false);
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), AbstractC16803z.smarttyping_icon_close);
        this.f61389G = decodeResource;
        int i11 = f61383M;
        this.f61389G = ThumbnailUtils.extractThumbnail(decodeResource, i11, i11);
        int m118722k0 = (AbstractC23136l9.m118722k0() - this.f61389G.getWidth()) - f61385O;
        int i12 = f61384N;
        this.f61390H = new Rect(m118722k0, i12, this.f61389G.getWidth() + m118722k0, this.f61389G.getHeight() + i12);
        this.f61391I = new C23528a(context);
    }

    @Override // com.zing.zalo.p077ui.chat.widget.searchinline.SearchRow
    /* renamed from: e */
    public void mo65614e() {
        setSearchResult(this.f61386D);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C13658k c13658k = this.f61388F;
        if (c13658k != null) {
            c13658k.m76325a(canvas);
        }
        Bitmap bitmap = this.f61389G;
        Rect rect = this.f61390H;
        canvas.drawBitmap(bitmap, rect.left, rect.top, (Paint) null);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        InterfaceC11803b interfaceC11803b;
        InterfaceC11803b interfaceC11803b2;
        int round = Math.round(motionEvent.getX());
        int round2 = Math.round(motionEvent.getY());
        boolean z11 = true;
        if (motionEvent.getAction() == 0) {
            if (this.f61390H.contains(round, round2)) {
                this.f61394L = true;
            } else {
                this.f61393K = true;
            }
        } else {
            if (motionEvent.getAction() == 1) {
                if (this.f61393K) {
                    this.f61393K = false;
                    if (!this.f61390H.contains(round, round2) && (interfaceC11803b2 = this.f61387E) != null) {
                        interfaceC11803b2.mo65622a(this, this.f61386D);
                    }
                } else if (this.f61394L) {
                    this.f61394L = false;
                    if (this.f61390H.contains(round, round2) && (interfaceC11803b = this.f61387E) != null) {
                        interfaceC11803b.mo65623b();
                    }
                }
            } else if (motionEvent.getAction() == 3) {
                this.f61393K = false;
                this.f61394L = false;
            }
            z11 = false;
        }
        if (!z11) {
            return super.onTouchEvent(motionEvent);
        }
        return z11;
    }

    public void setListener(InterfaceC11803b interfaceC11803b) {
        this.f61387E = interfaceC11803b;
    }

    public void setSearchResult(C31902e9 c31902e9) {
        this.f61386D = c31902e9;
        if (c31902e9 != null) {
            C29054b m153310b = c31902e9.m153310b();
            this.f61388F.m76336o(AbstractC23136l9.m118722k0(), (AbstractC23136l9.m118722k0() * m153310b.m145103c()) / m153310b.m145105e());
            C24003n m120077J0 = C23278z2.m120077J0();
            if (C23999j.m125696L2(m153310b.m145104d(), m120077J0)) {
                C3979l m123606l = this.f61391I.m123606l(m153310b.m145104d(), m120077J0.f116260a, m120077J0.f116263d, m120077J0.f116266g);
                if (m123606l != null) {
                    C3977j c3977j = this.f61392J;
                    if (c3977j != null) {
                        c3977j.setImageInfo(m123606l, false);
                    }
                    this.f61388F.m76334m(m123606l.m18839c(), false);
                    invalidate();
                }
            } else {
                this.f61388F.m76331h();
                ((C23528a) this.f61391I.m123612r(this.f61392J)).m123579C(m153310b.m145104d(), m120077J0, new C11802a());
            }
        }
        setOnTouchListener(this);
    }
}
