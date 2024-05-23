package com.zing.zalo.adapters;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.AbstractC1388a;
import androidx.recyclerview.widget.RecyclerView;
import au.C2343e;
import com.androidquery.util.AbstractC3972e;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.adapters.EventAttendeeDetailRercyclerAdapter;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalocore.CoreUtility;
import java.util.ArrayList;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p262jb.AbstractC21196a;
import p348mi.C23302b;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import vg.C28203u6;

/* loaded from: classes3.dex */
public class EventAttendeeDetailRercyclerAdapter extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    Context f37925r;

    /* renamed from: s */
    ArrayList f37926s;

    /* renamed from: t */
    EventAttendeeDetailItemView.InterfaceC6924b f37927t;

    /* loaded from: classes3.dex */
    public static class EventAttendeeDetailItemView extends View {

        /* renamed from: B */
        static Drawable f37929B;

        /* renamed from: C */
        static TextPaint f37930C;

        /* renamed from: p */
        StaticLayout f37934p;

        /* renamed from: q */
        ContactProfile f37935q;

        /* renamed from: r */
        int f37936r;

        /* renamed from: s */
        int f37937s;

        /* renamed from: t */
        Drawable f37938t;

        /* renamed from: u */
        C23528a f37939u;

        /* renamed from: v */
        C3977j f37940v;

        /* renamed from: w */
        InterfaceC6924b f37941w;

        /* renamed from: x */
        static final int f37931x = AbstractC23136l9.m118742r(35.0f);

        /* renamed from: y */
        static final int f37932y = AbstractC23136l9.m118742r(10.0f);

        /* renamed from: z */
        static final int f37933z = AbstractC23136l9.m118742r(16.0f);

        /* renamed from: A */
        static final int f37928A = AbstractC23136l9.m118742r(35.0f);

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.adapters.EventAttendeeDetailRercyclerAdapter$EventAttendeeDetailItemView$a */
        /* loaded from: classes3.dex */
        public class C6923a extends C23999j {

            /* renamed from: l1 */
            final /* synthetic */ String f37942l1;

            C6923a(String str) {
                this.f37942l1 = str;
            }

            @Override // p379o3.C23999j
            /* renamed from: O1 */
            public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
                try {
                    if (!str.equals(this.f37942l1)) {
                        return;
                    }
                    if (c3979l != null) {
                        if (c3979l.m18839c() != null) {
                            if (c3979l.m18839c().getWidth() == 1) {
                                if (c3979l.m18839c().getHeight() != 1) {
                                }
                            }
                            C3977j c3977j = EventAttendeeDetailItemView.this.f37940v;
                            if (c3977j != null) {
                                c3977j.setImageInfo(c3979l, false);
                            }
                            EventAttendeeDetailItemView.this.f37938t = new BitmapDrawable(EventAttendeeDetailItemView.this.getResources(), c3979l.m18839c());
                        }
                    }
                    EventAttendeeDetailItemView.this.invalidate();
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }

        /* renamed from: com.zing.zalo.adapters.EventAttendeeDetailRercyclerAdapter$EventAttendeeDetailItemView$b */
        /* loaded from: classes3.dex */
        public interface InterfaceC6924b {
            /* renamed from: a */
            void mo35592a(ContactProfile contactProfile);

            /* renamed from: b */
            void mo35593b();

            /* renamed from: c */
            void mo35594c(ArrayList arrayList);
        }

        public EventAttendeeDetailItemView(Context context) {
            super(context);
            this.f37940v = new C3977j(getContext());
            if (f37930C == null) {
                C13704p1 c13704p1 = new C13704p1();
                f37930C = c13704p1;
                c13704p1.setColor(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
                f37930C.setAntiAlias(true);
            }
            f37930C.setTextSize(AbstractC23136l9.m118742r(16.0f));
            if (f37929B == null) {
                Drawable m6964f = AbstractC1388a.m6964f(context, AbstractC16803z.default_avatar);
                f37929B = m6964f;
                int i11 = f37931x;
                m6964f.setBounds(0, 0, i11, i11);
            }
            this.f37939u = new C23528a(getContext());
            setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.r0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EventAttendeeDetailRercyclerAdapter.EventAttendeeDetailItemView.this.m35589c(view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m35589c(View view) {
            InterfaceC6924b interfaceC6924b = this.f37941w;
            if (interfaceC6924b != null) {
                interfaceC6924b.mo35592a(this.f37935q);
            }
        }

        /* renamed from: b */
        void m35590b() {
            int i11 = this.f37936r;
            int i12 = f37932y;
            this.f37934p = AbstractC23214t.m119625l(this.f37935q.m40383Q(true, true), f37930C, (((i11 - i12) - f37931x) - f37933z) - i12, 1);
        }

        /* renamed from: d */
        void m35591d() {
            try {
                AbstractC3972e.m18781f0(this.f37940v);
                this.f37938t = f37929B;
                String str = this.f37935q.f42446v;
                if (!TextUtils.isEmpty(str)) {
                    if (C23302b.f113247a.m120523d(str) && !CoreUtility.f89233i.equals(this.f37935q.f42434r)) {
                        ContactProfile contactProfile = this.f37935q;
                        String str2 = contactProfile.f42434r;
                        String m40383Q = contactProfile.m40383Q(true, false);
                        int m12307a = C2343e.m12307a(str2, false);
                        this.f37938t = C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(m40383Q), m12307a);
                    } else {
                        ((C23528a) this.f37939u.m123612r(this.f37940v)).m123579C(str, C23278z2.m120143n(), new C6923a(str));
                    }
                }
                invalidate();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            try {
                Drawable drawable = this.f37938t;
                if (drawable != null) {
                    int i11 = f37932y;
                    int i12 = f37931x;
                    drawable.setBounds(i11, 0, i11 + i12, i12);
                    this.f37938t.draw(canvas);
                }
                if (this.f37934p != null) {
                    canvas.save();
                    canvas.translate(f37932y + f37931x + f37933z, (f37928A / 2) - (this.f37934p.getHeight() / 2));
                    this.f37934p.draw(canvas);
                    canvas.restore();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // android.view.View
        protected void onMeasure(int i11, int i12) {
            setMeasuredDimension(View.MeasureSpec.getSize(i11), f37928A);
        }

        @Override // android.view.View
        protected void onSizeChanged(int i11, int i12, int i13, int i14) {
            super.onSizeChanged(i11, i12, i13, i14);
            if (i11 > 0 && i12 > 0) {
                if (i11 != this.f37936r || i12 != this.f37937s) {
                    this.f37936r = i11;
                    this.f37937s = i12;
                    if (this.f37935q != null) {
                        m35590b();
                    }
                }
            }
        }

        public void setData(String str) {
            try {
                ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
                this.f37935q = m141809c;
                if (m141809c != null) {
                    if (this.f37936r > 0 && this.f37937s > 0) {
                        m35590b();
                    }
                    m35591d();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        public void setListener(InterfaceC6924b interfaceC6924b) {
            this.f37941w = interfaceC6924b;
        }
    }

    /* renamed from: com.zing.zalo.adapters.EventAttendeeDetailRercyclerAdapter$a */
    /* loaded from: classes3.dex */
    static class C6925a extends RecyclerView.AbstractC1876c0 {
        C6925a(View view) {
            super(view);
        }
    }

    public EventAttendeeDetailRercyclerAdapter(Context context, ArrayList arrayList, EventAttendeeDetailItemView.InterfaceC6924b interfaceC6924b) {
        this.f37925r = context;
        this.f37926s = arrayList;
        this.f37927t = interfaceC6924b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        EventAttendeeDetailItemView eventAttendeeDetailItemView = (EventAttendeeDetailItemView) abstractC1876c0.f7784p;
        eventAttendeeDetailItemView.setListener(this.f37927t);
        eventAttendeeDetailItemView.setData((String) this.f37926s.get(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        return new C6925a(new EventAttendeeDetailItemView(this.f37925r));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f37926s.size();
    }
}
