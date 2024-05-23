package com.zing.zalo.feed.components;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import au.C2365p;
import bo.C3021p1;
import bo.C3031r1;
import bo.C3036s1;
import bo.C3044u1;
import bo.C3048v1;
import bo.C3052w1;
import bo.C3056x1;
import br.InterfaceC3116a;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC6918a0;
import me0.C23278z2;
import p133ek.AbstractC18458a;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p458qr.AbstractC25474g;
import p458qr.C25476i;
import p716zh.C31845ac;
import p716zh.C31890dc;
import ru.C25978a;

/* loaded from: classes4.dex */
public abstract class BaseSocialMemoryPage extends RelativeLayout implements InterfaceC8411v6 {

    /* renamed from: A */
    String f44127A;

    /* renamed from: p */
    int f44128p;

    /* renamed from: q */
    View f44129q;

    /* renamed from: r */
    TextView f44130r;

    /* renamed from: s */
    TextView f44131s;

    /* renamed from: t */
    C3977j f44132t;

    /* renamed from: u */
    Bitmap f44133u;

    /* renamed from: v */
    String f44134v;

    /* renamed from: w */
    int f44135w;

    /* renamed from: x */
    InterfaceC3116a f44136x;

    /* renamed from: y */
    C3056x1 f44137y;

    /* renamed from: z */
    int f44138z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.BaseSocialMemoryPage$a */
    /* loaded from: classes4.dex */
    public class C8071a extends C23999j {
        C8071a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (str != null && str.equals(BaseSocialMemoryPage.this.f44132t.getTag(AbstractC6918a0.tag_url_recycling_image_module))) {
                BaseSocialMemoryPage.this.f44132t.setImageInfo(c3979l, false);
                if (c3979l.m18839c() != null) {
                    BaseSocialMemoryPage baseSocialMemoryPage = BaseSocialMemoryPage.this;
                    if (baseSocialMemoryPage.f44133u == null && baseSocialMemoryPage.f44128p == 1) {
                        baseSocialMemoryPage.m43510h(c3979l.m18839c(), str);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.BaseSocialMemoryPage$b */
    /* loaded from: classes4.dex */
    public class C8072b extends AbstractC25474g {

        /* renamed from: a */
        final /* synthetic */ Bitmap f44140a;

        /* renamed from: b */
        final /* synthetic */ String f44141b;

        C8072b(Bitmap bitmap, String str) {
            this.f44140a = bitmap;
            this.f44141b = str;
        }

        @Override // p458qr.AbstractC25474g
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Bitmap mo15774a() {
            return C2365p.m12377i(C25978a.m133807a()).m12381f(this.f44140a);
        }

        @Override // p458qr.AbstractC25474g
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo43518c(Bitmap bitmap) {
            if (!TextUtils.isEmpty(this.f44141b) && this.f44141b.equals(BaseSocialMemoryPage.this.f44134v)) {
                BaseSocialMemoryPage.this.f44133u = bitmap;
            }
            BaseSocialMemoryPage baseSocialMemoryPage = BaseSocialMemoryPage.this;
            InterfaceC3116a interfaceC3116a = baseSocialMemoryPage.f44136x;
            if (interfaceC3116a != null) {
                interfaceC3116a.mo15738dF(baseSocialMemoryPage.f44135w);
            }
        }
    }

    public BaseSocialMemoryPage(Context context) {
        super(context, null);
        this.f44128p = 0;
        this.f44134v = "";
        this.f44138z = 0;
        this.f44127A = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m43510h(Bitmap bitmap, String str) {
        C25476i.m131959d(new C8072b(bitmap, str));
    }

    /* renamed from: b */
    protected void m43511b(String str, C23528a c23528a) {
        C24003n m120106Y;
        if (c23528a != null && !TextUtils.isEmpty(str)) {
            if (!this.f44134v.equals(str)) {
                this.f44134v = str;
                this.f44133u = null;
            }
            this.f44132t.setTag(AbstractC6918a0.tag_url_recycling_image_module, str);
            C23528a c23528a2 = (C23528a) c23528a.m123612r(this.f44132t);
            if (this.f44128p == 1) {
                m120106Y = C23278z2.m120085N0();
            } else {
                m120106Y = C23278z2.m120106Y();
            }
            c23528a2.m123579C(str, m120106Y, new C8071a());
        }
    }

    /* renamed from: c */
    public void mo43512c(C3056x1 c3056x1, C23528a c23528a) {
        C3052w1 c3052w1;
        C3036s1 c3036s1;
        if (c3056x1 != null && (c3052w1 = c3056x1.f12358e) != null) {
            m43511b(this.f44127A, c23528a);
            C3021p1 c3021p1 = c3052w1.f12305d;
            C3031r1 c3031r1 = null;
            if (c3021p1 != null) {
                c3036s1 = c3021p1.f12068a;
            } else {
                c3036s1 = null;
            }
            mo43514e(c3036s1);
            C3021p1 c3021p12 = c3052w1.f12305d;
            if (c3021p12 != null) {
                c3031r1 = c3021p12.f12069b;
            }
            mo43513d(c3031r1);
        }
    }

    /* renamed from: d */
    protected void mo43513d(C3031r1 c3031r1) {
        if (this.f44131s != null && c3031r1 != null) {
            String str = AbstractC18458a.f93019a;
            if (!str.equals("en") && !str.equals("my")) {
                this.f44131s.setText(c3031r1.f12216a);
            } else {
                this.f44131s.setText(c3031r1.f12217b);
            }
        }
    }

    /* renamed from: e */
    protected void mo43514e(C3036s1 c3036s1) {
        if (this.f44130r != null && c3036s1 != null) {
            String str = AbstractC18458a.f93019a;
            if (!str.equals("en") && !str.equals("my")) {
                this.f44130r.setText(c3036s1.f12234a);
            } else {
                this.f44130r.setText(c3036s1.f12235b);
            }
        }
    }

    /* renamed from: f */
    public void m43515f() {
        LayoutInflater.from(getContext()).inflate(getLayoutResource(), this);
        mo43516g();
        mo43517i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public void mo43516g() {
        this.f44129q = findViewById(AbstractC6918a0.root_view);
        this.f44130r = (TextView) findViewById(AbstractC6918a0.txt_title);
        this.f44131s = (TextView) findViewById(AbstractC6918a0.txt_desc);
        this.f44132t = new C3977j(getContext());
    }

    @Override // com.zing.zalo.feed.components.InterfaceC8411v6
    public int getBackgroundColor() {
        int i11 = this.f44128p;
        int i12 = 0;
        if (i11 == 1) {
            return 0;
        }
        if (i11 != 2) {
            return getBackgroundColorDefault();
        }
        C3044u1 memoryDetailDecorInfo = getMemoryDetailDecorInfo();
        if (memoryDetailDecorInfo != null) {
            i12 = memoryDetailDecorInfo.f12270b;
        }
        if (i12 != 0) {
            return i12;
        }
        if (this.f44138z == 0) {
            return getBackgroundColorDefault();
        }
        C31890dc m153036O = C31845ac.m152996J().m153036O(String.valueOf(this.f44138z));
        if (m153036O != null) {
            return m153036O.m153237b();
        }
        return getBackgroundColorDefault();
    }

    protected abstract int getBackgroundColorDefault();

    @Override // com.zing.zalo.feed.components.InterfaceC8411v6
    public Bitmap getBackgroundUrlBitmap() {
        C3977j c3977j;
        if (!TextUtils.isEmpty(this.f44127A) && (c3977j = this.f44132t) != null && c3977j.m18836a() != null && this.f44127A.equals(this.f44132t.getTag(AbstractC6918a0.tag_url_recycling_image_module)) && this.f44127A.equals(this.f44134v)) {
            int i11 = this.f44128p;
            if (i11 != 1) {
                if (i11 == 2) {
                    return this.f44132t.m18836a().m18839c();
                }
                return null;
            }
            return this.f44133u;
        }
        return null;
    }

    public View getContentView() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getEventType() {
        C3048v1 memoryDetailEventInfo = getMemoryDetailEventInfo();
        if (memoryDetailEventInfo != null) {
            return memoryDetailEventInfo.f12293a;
        }
        return -1;
    }

    abstract int getLayoutResource();

    public C3044u1 getMemoryDetailDecorInfo() {
        C3052w1 memoryDetailInfo = getMemoryDetailInfo();
        if (memoryDetailInfo != null) {
            return memoryDetailInfo.f12304c;
        }
        return null;
    }

    protected C3048v1 getMemoryDetailEventInfo() {
        C3052w1 memoryDetailInfo = getMemoryDetailInfo();
        if (memoryDetailInfo != null) {
            return memoryDetailInfo.f12302a;
        }
        return null;
    }

    public C3052w1 getMemoryDetailInfo() {
        C3056x1 c3056x1 = this.f44137y;
        if (c3056x1 != null) {
            return c3056x1.f12358e;
        }
        return null;
    }

    @Override // com.zing.zalo.feed.components.InterfaceC8411v6
    public int getOverlayColor() {
        return 0;
    }

    public View getTitleView() {
        return this.f44130r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public void mo43517i() {
    }

    public void setBackgroundUrl(String str) {
        this.f44127A = str;
    }

    public void setBgType(int i11) {
        this.f44128p = i11;
    }

    public void setCallback(InterfaceC3116a interfaceC3116a) {
        this.f44136x = interfaceC3116a;
    }

    public void setData(C3056x1 c3056x1) {
        this.f44137y = c3056x1;
    }

    public void setPosition(int i11) {
        this.f44135w = i11;
    }

    public void setTypoId(int i11) {
        this.f44138z = i11;
    }

    public void setupViewsByData(C3056x1 c3056x1) {
    }

    public BaseSocialMemoryPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f44128p = 0;
        this.f44134v = "";
        this.f44138z = 0;
        this.f44127A = "";
    }

    public BaseSocialMemoryPage(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f44128p = 0;
        this.f44134v = "";
        this.f44138z = 0;
        this.f44127A = "";
    }
}
