package com.zing.zalo.p077ui.picker.mediapicker.custom;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.data.mediapicker.model.InlineBannerItem;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.p077ui.widget.ChangeableHeightRelativeLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import p354n3.C23528a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class MediaPickerInlineBannerView extends ChangeableHeightRelativeLayout {

    /* renamed from: p */
    private final InterfaceC24854k f66774p;

    /* renamed from: q */
    private View f66775q;

    /* renamed from: r */
    private RobotoTextView f66776r;

    /* renamed from: s */
    private RecyclingImageView f66777s;

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.custom.MediaPickerInlineBannerView$a */
    /* loaded from: classes6.dex */
    static final class C12852a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ViewGroup f66778q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12852a(ViewGroup viewGroup) {
            super(0);
            this.f66778q = viewGroup;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C23528a mo12V4() {
            return new C23528a(this.f66778q.getContext());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPickerInlineBannerView(ViewGroup viewGroup) {
        super(viewGroup.getContext(), null);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(viewGroup, "parent");
        m129210a = AbstractC24856m.m129210a(new C12852a(viewGroup));
        this.f66774p = m129210a;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.media_picker_inline_banner_layout, this);
        AbstractC19074t.m100207e(inflate, "inflate(...)");
        View findViewById = inflate.findViewById(AbstractC6918a0.inline_banner_container);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        this.f66775q = findViewById;
        View findViewById2 = inflate.findViewById(AbstractC6918a0.inline_banner_close);
        AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
        this.f66777s = (RecyclingImageView) findViewById2;
        View findViewById3 = inflate.findViewById(AbstractC6918a0.inline_banner_desc);
        AbstractC19074t.m100207e(findViewById3, "findViewById(...)");
        this.f66776r = (RobotoTextView) findViewById3;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }

    private final C23528a getAQuery() {
        return (C23528a) this.f66774p.getValue();
    }

    public final void setActionListener(View.OnClickListener onClickListener) {
        AbstractC19074t.m100208f(onClickListener, "l");
        this.f66777s.setOnClickListener(onClickListener);
    }

    public final void setInlineBannerItem(MediaItem mediaItem) {
        if (mediaItem instanceof InlineBannerItem) {
            InlineBannerItem inlineBannerItem = (InlineBannerItem) mediaItem;
            this.f66775q.setBackgroundColor(inlineBannerItem.m41091s1().m135165a());
            int i11 = 0;
            this.f66775q.setVisibility(0);
            this.f66776r.setText(inlineBannerItem.m41091s1().m135174j());
            this.f66776r.setTextColor(inlineBannerItem.m41091s1().m135173i());
            if (inlineBannerItem.m41091s1().m135166b().length() > 0) {
                ((C23528a) getAQuery().m123612r(this.f66777s)).m123616v(inlineBannerItem.m41091s1().m135166b());
            }
            RecyclingImageView recyclingImageView = this.f66777s;
            if (inlineBannerItem.m41091s1().m135169e() != 0) {
                i11 = 8;
            }
            recyclingImageView.setVisibility(i11);
        }
    }
}
