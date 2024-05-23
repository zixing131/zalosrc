package com.zing.zalo.feed.components;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import au.C2370r0;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import com.zing.zalo.social.controls.C10872k;
import com.zing.zalo.social.controls.C10873l;
import i40.C20275e;
import me0.AbstractC23006a0;
import me0.AbstractC23136l9;
import me0.AbstractC23170p;
import me0.C23278z2;
import p348mi.C23307g;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p489rn.C25849b;

/* loaded from: classes4.dex */
public class CommentItemPhoto extends CommentItemBase {

    /* renamed from: O */
    private AspectRatioImageView f44173O;

    /* renamed from: P */
    private final SparseIntArray f44174P;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.CommentItemPhoto$a */
    /* loaded from: classes4.dex */
    public class C8075a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f44175l1;

        C8075a(String str) {
            this.f44175l1 = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
                if (interfaceC3968a != null && this.f44175l1.equals(str) && (interfaceC3968a instanceof AspectRatioImageView)) {
                    ((AspectRatioImageView) interfaceC3968a).setShowLoading(false);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public CommentItemPhoto(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44174P = new SparseIntArray();
    }

    /* renamed from: U */
    private void m43572U(final C10873l c10873l, boolean z11, final int i11) {
        int m118742r;
        try {
            C10872k c10872k = c10873l.f54891G;
            if (c10872k == null) {
                return;
            }
            String str = c10872k.f54877i;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f44173O.getLayoutParams();
            if (TextUtils.isEmpty(c10873l.m56495v())) {
                m118742r = 0;
            } else {
                m118742r = AbstractC23136l9.m118742r(5.0f);
            }
            marginLayoutParams.topMargin = m118742r;
            this.f44173O.setLayoutParams(marginLayoutParams);
            this.f44173O.setImageDrawable(null);
            this.f44173O.setImageDrawable(AbstractC23170p.m119358p(getContext()));
            this.f44173O.setTag(String.format("image#%s", Integer.valueOf(i11)));
            if (C23999j.m125696L2(str, C23278z2.m120126f0())) {
                ((C23528a) this.f44147E.m123612r(this.f44173O)).m123619y(str, C23278z2.m120126f0(), 10);
                this.f44173O.setShowLoading(false);
            } else {
                this.f44173O.setShowLoading(true);
                ((C23528a) this.f44147E.m123612r(this.f44173O)).m123579C(str, C23278z2.m120126f0(), new C8075a(str).m125762H1(AbstractC23006a0.f111912c));
            }
            this.f44173O.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.f0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CommentItemPhoto.this.m43574W(c10873l, i11, view);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: V */
    private void m43573V(int i11) {
        try {
            this.f44174P.clear();
            this.f44174P.put(0, i11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public /* synthetic */ void m43574W(C10873l c10873l, int i11, View view) {
        m43576Y(c10873l, view, this, i11);
    }

    private void setScaleOption(C10873l c10873l) {
        int i11;
        int i12;
        try {
            AspectRatioImageView aspectRatioImageView = this.f44173O;
            if (aspectRatioImageView != null && c10873l != null && c10873l.f54891G != null) {
                aspectRatioImageView.setMaximumHeight(AbstractC23136l9.m118742r(170.0f));
                this.f44173O.setMinWidth(AbstractC23136l9.m118742r(1.0f));
                this.f44173O.setMinHeight(AbstractC23136l9.m118742r(1.0f));
                C23307g c23307g = c10873l.f54891G.f54880l;
                if (c23307g != null && (i11 = c23307g.f113474a) > 0 && (i12 = c23307g.f113475b) > 0) {
                    this.f44173O.setRatio(i12 / i11);
                    this.f44173O.setScaleOption(4);
                } else {
                    this.f44173O.setScaleOption(1);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: X */
    public void m43575X(C10873l c10873l, boolean z11, int i11, int i12, int i13) {
        if (c10873l == null) {
            return;
        }
        try {
            setScaleOption(c10873l);
            m43557Q(c10873l, z11, i11, i12);
            m43572U(c10873l, z11, i13);
            m43556P(c10873l);
            mo43562x(c10873l, i13);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Y */
    void m43576Y(C10873l c10873l, View view, ViewGroup viewGroup, int i11) {
        try {
            m43573V(i11);
            C20275e c20275e = new C20275e();
            c20275e.m105861G(new C2370r0(viewGroup));
            c20275e.m105857C(this.f44174P);
            C25849b.a aVar = this.f44150H;
            if (aVar != null) {
                aVar.mo46570b(c10873l, view, c20275e, i11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.feed.components.CommentItemBase
    /* renamed from: y */
    public void mo43563y(Context context) {
        try {
            ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(AbstractC7409c0.comment_item_photo_content, this);
            this.f44173O = (AspectRatioImageView) findViewById(AbstractC6918a0.imvPhoto);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.mo43563y(context);
    }
}
