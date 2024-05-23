package com.zing.zalo.p077ui.mediastore.collection;

import ae.C0766k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ci.C3492b;
import ci.C3508j;
import ci.C3510k;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.mediastore.collection.MediaStoreCollectionItemView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import on0.AbstractC24341v;
import org.json.JSONObject;
import p304ks.AbstractC21935u;
import p354n3.C23528a;
import p379o3.C24003n;
import vg.C28203u6;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class MediaStoreCollectionItemView extends RelativeLayout {
    public static final C12342a Companion = new C12342a(null);

    /* renamed from: A */
    private int f64206A;

    /* renamed from: B */
    private int f64207B;

    /* renamed from: C */
    private boolean f64208C;

    /* renamed from: D */
    private int f64209D;

    /* renamed from: p */
    private final int f64210p;

    /* renamed from: q */
    private TextView f64211q;

    /* renamed from: r */
    private RelativeLayout f64212r;

    /* renamed from: s */
    private LinearLayout f64213s;

    /* renamed from: t */
    private RelativeLayout f64214t;

    /* renamed from: u */
    private C23528a f64215u;

    /* renamed from: v */
    private RecyclingImageView[] f64216v;

    /* renamed from: w */
    private C3508j f64217w;

    /* renamed from: x */
    private int f64218x;

    /* renamed from: y */
    private int f64219y;

    /* renamed from: z */
    private int f64220z;

    /* renamed from: com.zing.zalo.ui.mediastore.collection.MediaStoreCollectionItemView$a */
    /* loaded from: classes6.dex */
    public static final class C12342a {
        private C12342a() {
        }

        public /* synthetic */ C12342a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.collection.MediaStoreCollectionItemView$b */
    /* loaded from: classes6.dex */
    public static final class C12343b implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ C3508j f64222b;

        C12343b(C3508j c3508j) {
            this.f64222b = c3508j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m69437d(MediaStoreCollectionItemView mediaStoreCollectionItemView, C3508j c3508j) {
            AbstractC19074t.m100208f(mediaStoreCollectionItemView, "this$0");
            TextView textView = mediaStoreCollectionItemView.f64211q;
            if (textView != null) {
                textView.setText(c3508j.m17694G0());
            }
            mediaStoreCollectionItemView.m69433d(c3508j);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            Long l11;
            boolean m127126v;
            if (obj != null) {
                ContactProfile contactProfile = new ContactProfile((JSONObject) obj);
                String str = contactProfile.f42434r;
                C3508j albumItem = MediaStoreCollectionItemView.this.getAlbumItem();
                if (albumItem != null) {
                    l11 = Long.valueOf(albumItem.m17711w0());
                } else {
                    l11 = null;
                }
                if (AbstractC19074t.m100204b(str, String.valueOf(l11))) {
                    if (C7960e.m41971c6() != null) {
                        String str2 = contactProfile.f42434r;
                        AbstractC19074t.m100207e(str2, "uid");
                        if (str2.length() > 0) {
                            m127126v = AbstractC24341v.m127126v(contactProfile.f42434r, "null", true);
                            if (!m127126v) {
                                C7960e.m41971c6().m42221O7(contactProfile, AbstractC21935u.m114558y(contactProfile.f42434r));
                            }
                        }
                    }
                    this.f64222b.m17710v0(contactProfile);
                    final MediaStoreCollectionItemView mediaStoreCollectionItemView = MediaStoreCollectionItemView.this;
                    final C3508j c3508j = this.f64222b;
                    AbstractC19444a.m101697e(new Runnable() { // from class: y70.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            MediaStoreCollectionItemView.C12343b.m69437d(MediaStoreCollectionItemView.this, c3508j);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.collection.MediaStoreCollectionItemView$c */
    /* loaded from: classes6.dex */
    public static final class C12344c extends ViewOutlineProvider {

        /* renamed from: a */
        final /* synthetic */ int f64223a;

        C12344c(int i11) {
            this.f64223a = i11;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f64223a);
        }
    }

    /* renamed from: com.zing.zalo.ui.mediastore.collection.MediaStoreCollectionItemView$d */
    /* loaded from: classes6.dex */
    public static final class C12345d extends ViewOutlineProvider {

        /* renamed from: a */
        final /* synthetic */ int f64224a;

        C12345d(int i11) {
            this.f64224a = i11;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(outline, "outline");
            int width = view.getWidth();
            int height = view.getHeight();
            int i11 = this.f64224a;
            outline.setRoundRect(0, 0, width, height + i11, i11);
        }
    }

    public MediaStoreCollectionItemView(Context context, int i11) {
        super(context);
        this.f64210p = i11;
        this.f64216v = new RecyclingImageView[4];
        m69434f();
    }

    /* renamed from: b */
    private final void m69428b(ArrayList arrayList) {
        C24003n m120164y0;
        RecyclingImageView recyclingImageView;
        C3492b c3492b;
        List list;
        boolean z11;
        if (this.f64210p == 2) {
            if (arrayList.size() == 1) {
                m120164y0 = C23278z2.m120157u0();
            } else {
                m120164y0 = C23278z2.m120161w0();
            }
        } else if (arrayList.size() == 1) {
            m120164y0 = C23278z2.m120161w0();
        } else {
            m120164y0 = C23278z2.m120164y0();
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                recyclingImageView = (RecyclingImageView) arrayList.get(i11);
                C3508j c3508j = this.f64217w;
                c3492b = null;
                if (c3508j != null) {
                    AbstractC19074t.m100205c(c3508j);
                    list = c3508j.mo17712x0();
                } else {
                    list = null;
                }
                if (list != null && list.size() > i11) {
                    c3492b = (C3492b) list.get(i11);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (c3492b != null && c3492b.m17523b()) {
                if (this.f64210p == 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Drawable m17522a = c3492b.m17522a(z11);
                if (m17522a != null) {
                    AbstractC19074t.m100205c(recyclingImageView);
                    recyclingImageView.setImageDrawable(m17522a);
                }
            }
            AbstractC19074t.m100205c(recyclingImageView);
            recyclingImageView.setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC16781w.ImagePlaceHolderColor));
            Drawable m118665N = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.chat_icloud_default);
            recyclingImageView.setImageDrawable(m118665N);
            if (c3492b != null && !TextUtils.isEmpty(c3492b.m17525d())) {
                C23528a c23528a = this.f64215u;
                AbstractC19074t.m100205c(c23528a);
                ((C23528a) c23528a.m123612r(recyclingImageView)).m123618x(c3492b.m17525d(), m120164y0);
            } else if (arrayList.size() == 1) {
                Context context = getContext();
                int i12 = this.f64209D;
                if (i12 == 0) {
                    i12 = AbstractC16803z.thumb_empty_album;
                }
                Drawable m118665N2 = AbstractC23136l9.m118665N(context, i12);
                C23528a c23528a2 = this.f64215u;
                AbstractC19074t.m100205c(c23528a2);
                ((C23528a) c23528a2.m123612r(recyclingImageView)).m123615u(m118665N2);
            } else {
                C23528a c23528a3 = this.f64215u;
                AbstractC19074t.m100205c(c23528a3);
                ((C23528a) c23528a3.m123612r(recyclingImageView)).m123615u(m118665N);
            }
        }
    }

    /* renamed from: e */
    private final RecyclingImageView m69429e(int i11) {
        if (i11 >= 0) {
            RecyclingImageView[] recyclingImageViewArr = this.f64216v;
            if (i11 < recyclingImageViewArr.length) {
                RecyclingImageView recyclingImageView = recyclingImageViewArr[i11];
                if (recyclingImageView == null) {
                    RecyclingImageView recyclingImageView2 = new RecyclingImageView(getContext());
                    recyclingImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    this.f64216v[i11] = recyclingImageView2;
                    return recyclingImageView2;
                }
                return recyclingImageView;
            }
            return null;
        }
        return null;
    }

    /* renamed from: g */
    private final void m69430g() {
        RelativeLayout relativeLayout = this.f64212r;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
            relativeLayout.getLayoutParams().width = -2;
            relativeLayout.getLayoutParams().height = this.f64219y;
            ArrayList arrayList = new ArrayList();
            RecyclingImageView m69429e = m69429e(0);
            AbstractC19074t.m100205c(m69429e);
            m69429e.setId(AbstractC6918a0.media_store_album_cover_imv_1);
            relativeLayout.addView(m69429e, new RelativeLayout.LayoutParams(this.f64218x, this.f64219y));
            arrayList.add(m69429e);
            m69428b(arrayList);
        }
    }

    /* renamed from: h */
    private final void m69431h() {
        RelativeLayout relativeLayout = this.f64212r;
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
            relativeLayout.getLayoutParams().width = -2;
            relativeLayout.getLayoutParams().height = this.f64219y;
            ArrayList arrayList = new ArrayList();
            int i11 = (this.f64219y - 2) / 2;
            int i12 = (this.f64218x - 2) / 2;
            RecyclingImageView m69429e = m69429e(0);
            AbstractC19074t.m100205c(m69429e);
            m69429e.setId(AbstractC6918a0.media_store_album_cover_imv_1);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i12, i11);
            layoutParams.rightMargin = 2;
            layoutParams.bottomMargin = 2;
            relativeLayout.addView(m69429e, layoutParams);
            arrayList.add(m69429e);
            RecyclingImageView m69429e2 = m69429e(1);
            AbstractC19074t.m100205c(m69429e2);
            m69429e2.setId(AbstractC6918a0.media_store_album_cover_imv_2);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i12, i11);
            layoutParams2.addRule(1, AbstractC6918a0.media_store_album_cover_imv_1);
            layoutParams2.bottomMargin = 2;
            relativeLayout.addView(m69429e2, layoutParams2);
            arrayList.add(m69429e2);
            RecyclingImageView m69429e3 = m69429e(2);
            AbstractC19074t.m100205c(m69429e3);
            m69429e3.setId(AbstractC6918a0.media_store_album_cover_imv_3);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(i12, i11);
            layoutParams3.addRule(3, AbstractC6918a0.media_store_album_cover_imv_1);
            layoutParams3.rightMargin = 2;
            relativeLayout.addView(m69429e3, layoutParams3);
            arrayList.add(m69429e3);
            RecyclingImageView m69429e4 = m69429e(3);
            AbstractC19074t.m100205c(m69429e4);
            m69429e4.setId(AbstractC6918a0.media_store_album_cover_imv_4);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(i12, i11);
            layoutParams4.addRule(3, AbstractC6918a0.media_store_album_cover_imv_1);
            layoutParams4.addRule(1, AbstractC6918a0.media_store_album_cover_imv_3);
            relativeLayout.addView(m69429e4, layoutParams4);
            arrayList.add(m69429e4);
            m69428b(arrayList);
        }
    }

    /* renamed from: c */
    public final void m69432c(C3508j c3508j, boolean z11) {
        float f11;
        if (c3508j == null) {
            return;
        }
        this.f64208C = z11;
        RelativeLayout relativeLayout = this.f64212r;
        float f12 = 1.0f;
        if (relativeLayout != null) {
            if (z11) {
                f11 = 0.3f;
            } else {
                f11 = 1.0f;
            }
            relativeLayout.setAlpha(f11);
        }
        LinearLayout linearLayout = this.f64213s;
        if (linearLayout != null) {
            if (z11) {
                f12 = 0.3f;
            }
            linearLayout.setAlpha(f12);
        }
        this.f64217w = c3508j;
        TextView textView = this.f64211q;
        if (textView != null) {
            CharSequence m17694G0 = c3508j.m17694G0();
            if (m17694G0 == null) {
                m17694G0 = "";
            }
            textView.setText(m17694G0);
        }
        m69433d(c3508j);
        if (C28203u6.m141800i(C28203u6.f131407a, c3508j.m17693F0(), false, 2, null) == null) {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C12343b(c3508j));
            c0766k.mo1514Q4(c3508j.m17693F0(), 0, new TrackingSource((short) 1060));
        }
    }

    /* renamed from: d */
    public final void m69433d(C3508j c3508j) {
        this.f64209D = AbstractC16803z.thumb_empty_album;
        C3508j.b bVar = C3508j.b.f14699p;
        boolean z11 = c3508j instanceof C3510k;
        if (z11) {
            bVar = ((C3510k) c3508j).m17713y0();
        } else if (c3508j != null) {
            bVar = c3508j.m17713y0();
        }
        if (bVar == C3508j.b.f14700q) {
            this.f64209D = AbstractC16803z.thumb_video_album;
        }
        if (z11) {
            m69431h();
        } else {
            m69430g();
        }
    }

    /* renamed from: f */
    public final void m69434f() {
        int m118742r;
        RelativeLayout relativeLayout;
        this.f64215u = new C23528a(getContext());
        LayoutInflater from = LayoutInflater.from(getContext());
        if (this.f64210p == 3) {
            setBackgroundResource(AbstractC16803z.stencils_contact_bg);
            from.inflate(AbstractC7409c0.layout_media_store_album_item_in_search_mode, this);
        } else {
            from.inflate(AbstractC7409c0.layout_media_store_album_item, this);
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) findViewById(AbstractC6918a0.container_layout);
        this.f64214t = relativeLayout2;
        if (relativeLayout2 != null) {
            relativeLayout2.setBackgroundResource(AbstractC16803z.stencils_album_card_6_corner_bg);
        }
        this.f64213s = (LinearLayout) findViewById(AbstractC6918a0.search_item_layout_container);
        this.f64211q = (TextView) findViewById(AbstractC6918a0.tv_album_title);
        this.f64212r = (RelativeLayout) findViewById(AbstractC6918a0.album_cover_photo_group);
        int i11 = this.f64210p;
        if (i11 != 1 && i11 != 4 && i11 != 3) {
            m118742r = AbstractC23136l9.m118742r(8.0f);
        } else {
            m118742r = AbstractC23136l9.m118742r(6.0f);
        }
        if (this.f64210p != 3 && (relativeLayout = this.f64214t) != null) {
            relativeLayout.setOutlineProvider(new C12344c(m118742r));
            relativeLayout.setClipToOutline(true);
        }
        RelativeLayout relativeLayout3 = this.f64212r;
        if (relativeLayout3 != null) {
            relativeLayout3.setOutlineProvider(new C12345d(m118742r));
            relativeLayout3.setClipToOutline(true);
        }
        int i12 = this.f64210p;
        if (i12 != 1) {
            if (i12 != 2 && i12 != 3) {
                if (i12 == 4) {
                    int dimensionPixelSize = getResources().getDimensionPixelSize(AbstractC16802y.media_store_album_list_item_margin);
                    int dimensionPixelSize2 = getResources().getDimensionPixelSize(AbstractC16802y.media_store_album_list_padding);
                    RelativeLayout relativeLayout4 = this.f64214t;
                    if (relativeLayout4 != null) {
                        ViewGroup.LayoutParams layoutParams = relativeLayout4.getLayoutParams();
                        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                        layoutParams2.topMargin = dimensionPixelSize;
                        layoutParams2.bottomMargin = dimensionPixelSize;
                        layoutParams2.addRule(14);
                    }
                    int m118722k0 = ((AbstractC23136l9.m118722k0() - (dimensionPixelSize2 * 2)) - (dimensionPixelSize * 4)) / 2;
                    this.f64218x = m118722k0;
                    this.f64219y = (m118722k0 * 46) / 77;
                    return;
                }
                return;
            }
            RelativeLayout relativeLayout5 = this.f64214t;
            if (relativeLayout5 != null) {
                relativeLayout5.setBackgroundResource(AbstractC16803z.stencils_album_card_8_corner_bg);
                int dimensionPixelSize3 = relativeLayout5.getResources().getDimensionPixelSize(AbstractC16802y.media_store_album_list_item_margin);
                ViewGroup.LayoutParams layoutParams3 = relativeLayout5.getLayoutParams();
                AbstractC19074t.m100206d(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                layoutParams4.topMargin = dimensionPixelSize3;
                layoutParams4.bottomMargin = dimensionPixelSize3;
                layoutParams4.addRule(14);
            }
            int m118722k02 = (AbstractC23136l9.m118722k0() - (AbstractC23136l9.m118742r(18.0f) * 3)) / 2;
            this.f64218x = m118722k02;
            this.f64219y = (m118722k02 * 46) / 77;
            this.f64220z = getResources().getDimensionPixelSize(AbstractC16802y.media_store_album_list_suggest_item_photogroup_height);
            this.f64206A = getResources().getDimensionPixelSize(AbstractC16802y.media_store_album_list_suggest_item_photo_big_width);
            this.f64207B = getResources().getDimensionPixelSize(AbstractC16802y.media_store_album_list_suggest_item_photo_small_width);
            TextView textView = this.f64211q;
            if (textView != null) {
                textView.setTextSize(1, 15.0f);
                return;
            }
            return;
        }
        this.f64218x = getResources().getDimensionPixelSize(AbstractC16802y.media_store_horizontal_album_list_item_photogroup_width_small);
        this.f64219y = getResources().getDimensionPixelSize(AbstractC16802y.media_store_horizontal_album_list_item_photogroup_height);
        this.f64220z = getResources().getDimensionPixelSize(AbstractC16802y.media_store_horizontal_album_list_item_photogroup_height);
        this.f64206A = getResources().getDimensionPixelSize(AbstractC16802y.media_store_horizontal_album_list_item_photo_big_width);
        this.f64207B = getResources().getDimensionPixelSize(AbstractC16802y.media_store_horizontal_album_list_item_photo_small_width);
    }

    public final C3508j getAlbumItem() {
        return this.f64217w;
    }

    /* renamed from: i */
    public final void m69435i() {
        CharSequence charSequence;
        TextView textView = this.f64211q;
        if (textView != null) {
            C3508j c3508j = this.f64217w;
            if (c3508j == null || (charSequence = c3508j.m17695H0()) == null) {
                charSequence = "";
            }
            textView.setText(charSequence);
        }
    }

    public final void setAlbumItem(C3508j c3508j) {
        this.f64217w = c3508j;
    }
}
