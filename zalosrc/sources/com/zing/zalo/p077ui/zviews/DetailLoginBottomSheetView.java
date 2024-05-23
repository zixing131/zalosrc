package com.zing.zalo.p077ui.zviews;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import bi0.AbstractC2808b;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.zdesign.component.Badge;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import java.util.Locale;
import me0.AbstractC23136l9;
import me0.C23212s8;
import org.json.JSONObject;
import p262jb.AbstractC21196a;
import p649xl.C29719b;
import p649xl.C30061u2;
import p649xl.C30078v2;
import p716zh.C32077q6;
import ui0.C27280g;

/* loaded from: classes6.dex */
public final class DetailLoginBottomSheetView extends BottomSheetZaloViewWithAnim {
    public static final C14220a Companion = new C14220a(null);

    /* renamed from: W0 */
    public C30078v2 f73136W0;

    /* renamed from: X0 */
    private C32077q6 f73137X0;

    /* renamed from: com.zing.zalo.ui.zviews.DetailLoginBottomSheetView$a */
    /* loaded from: classes6.dex */
    public static final class C14220a {
        private C14220a() {
        }

        public /* synthetic */ C14220a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pM */
    public static final void m79270pM(C32077q6.a aVar, DetailLoginBottomSheetView detailLoginBottomSheetView, View view) {
        String str;
        AbstractC19074t.m100208f(detailLoginBottomSheetView, "this$0");
        Intent intent = new Intent();
        intent.putExtra("EXTRA_ACTION", aVar.f147731a);
        C32077q6 c32077q6 = detailLoginBottomSheetView.f73137X0;
        if (c32077q6 != null) {
            str = c32077q6.f147724q;
        } else {
            str = null;
        }
        intent.putExtra("EXTRA_BUNDLE_DATA", str);
        ZaloView m92650VI = detailLoginBottomSheetView.m92650VI();
        if (m92650VI != null) {
            m92650VI.mo50035CK(-1, intent);
        }
        detailLoginBottomSheetView.close();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        String str;
        super.mo37111CJ(bundle);
        try {
            Bundle m92642L3 = m92642L3();
            if (m92642L3 != null) {
                str = m92642L3.getString("EXTRA_BUNDLE_DATA", "");
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                this.f73137X0 = C32077q6.m154730b(new JSONObject(str));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: eM */
    public int mo37128eM() {
        return (this.f72455N0.getHeight() - m79271nM().getRoot().getHeight()) - AbstractC23136l9.m118742r(20.0f);
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: fM */
    protected void mo37129fM(LinearLayout linearLayout) {
        C30078v2 m148599c = C30078v2.m148599c(LayoutInflater.from(getContext()), linearLayout, true);
        AbstractC19074t.m100207e(m148599c, "inflate(...)");
        m79273qM(m148599c);
        m79272oM();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: gM */
    public void mo37132gM() {
        super.mo37132gM();
        this.f72454M0.setMinTranslationY(mo37128eM());
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "DetailLoginBottomSheetView";
    }

    /* renamed from: nM */
    public final C30078v2 m79271nM() {
        C30078v2 c30078v2 = this.f73136W0;
        if (c30078v2 != null) {
            return c30078v2;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    /* renamed from: oM */
    public final void m79272oM() {
        int i11;
        ViewGroup.LayoutParams layoutParams = this.f72455N0.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
            this.f72455N0.setLayoutParams(layoutParams);
        }
        m78539iM(true);
        this.f72454M0.setCanOverTranslateMaxY(true);
        C32077q6 c32077q6 = this.f73137X0;
        if (c32077q6 != null) {
            m79271nM().f139626v.setText(c32077q6.f147708a);
            ZAppCompatImageView zAppCompatImageView = m79271nM().f139621q;
            Context context = m79271nM().getRoot().getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            zAppCompatImageView.setImageDrawable(C27280g.m139660c(context, c32077q6.f147721n, AbstractC21196a.TextColor1));
            String str = c32077q6.f147726s;
            if (str != null && str.length() != 0) {
                Badge badge = m79271nM().f139625u;
                String str2 = c32077q6.f147726s;
                AbstractC19074t.m100207e(str2, "labelText");
                String upperCase = str2.toUpperCase(Locale.ROOT);
                AbstractC19074t.m100207e(upperCase, "toUpperCase(...)");
                badge.setBadgeText(upperCase);
                Drawable background = m79271nM().f139625u.getBackground();
                Context context2 = m79271nM().f139625u.getContext();
                if (c32077q6.f147725r == 1) {
                    i11 = AbstractC2808b.skb60;
                } else {
                    i11 = AbstractC2808b.f150839y60;
                }
                background.setTint(AbstractC23136l9.m118641B(context2, i11));
            } else {
                m79271nM().f139625u.setVisibility(8);
            }
            List list = c32077q6.f147729v;
            if (list != null && !list.isEmpty()) {
                for (C32077q6.b bVar : c32077q6.f147729v) {
                    C30061u2 m148557c = C30061u2.m148557c(LayoutInflater.from(m79271nM().f139624t.getContext()), m79271nM().f139624t, true);
                    AbstractC19074t.m100207e(m148557c, "inflate(...)");
                    m148557c.f139534q.setText(bVar.f147733a + ":");
                    m148557c.f139535r.setText(bVar.f147734b);
                }
            }
            List list2 = c32077q6.f147730w;
            if (list2 != null && !list2.isEmpty()) {
                boolean z11 = false;
                for (final C32077q6.a aVar : c32077q6.f147730w) {
                    if (z11) {
                        View view = new View(m79271nM().f139623s.getContext());
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 1);
                        layoutParams2.setMargins(AbstractC23136l9.m118742r(56.0f), 0, 0, 0);
                        view.setLayoutParams(layoutParams2);
                        view.setBackgroundColor(C23212s8.m119607o(m79271nM().f139623s.getContext(), AbstractC16781w.ItemSeparatorColor));
                        m79271nM().f139623s.addView(view);
                    }
                    C29719b m147743c = C29719b.m147743c(LayoutInflater.from(m79271nM().f139623s.getContext()), m79271nM().f139623s, true);
                    AbstractC19074t.m100207e(m147743c, "inflate(...)");
                    m147743c.f137278r.setText(aVar.f147732b);
                    int m154732d = C32077q6.m154732d(aVar.f147731a);
                    if (m154732d != 0) {
                        ZAppCompatImageView zAppCompatImageView2 = m147743c.f137277q;
                        Context context3 = zAppCompatImageView2.getContext();
                        AbstractC19074t.m100207e(context3, "getContext(...)");
                        zAppCompatImageView2.setImageDrawable(C27280g.m139660c(context3, m154732d, AbstractC21196a.TextColor2));
                    }
                    m147743c.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.mb
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            DetailLoginBottomSheetView.m79270pM(C32077q6.a.this, this, view2);
                        }
                    });
                    z11 = true;
                }
                return;
            }
            m79271nM().f139622r.setVisibility(4);
        }
    }

    /* renamed from: qM */
    public final void m79273qM(C30078v2 c30078v2) {
        AbstractC19074t.m100208f(c30078v2, "<set-?>");
        this.f73136W0 = c30078v2;
    }
}
