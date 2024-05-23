package com.zing.zalo.stickers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.StickerView;
import p354n3.C23528a;
import p471r3.C25630b;
import vg.C28020b3;

/* loaded from: classes5.dex */
public class StickerQuickItem extends LinearLayout {

    /* renamed from: p */
    private StickerView f55052p;

    /* renamed from: q */
    private ProgressBar f55053q;

    /* renamed from: r */
    private final C23528a f55054r;

    public StickerQuickItem(Context context) {
        super(context);
        m56565a(context);
        this.f55054r = new C23528a(context);
    }

    /* renamed from: a */
    private void m56565a(Context context) {
        try {
            ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(AbstractC7409c0.sticker_quickitem, this);
            this.f55052p = (StickerView) findViewById(AbstractC6918a0.sticker_item_element);
            this.f55053q = (ProgressBar) findViewById(AbstractC6918a0.f37904pb);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public String getEmoticon() {
        return this.f55052p.getEmoticon();
    }

    public void setEmoticon(String str) {
        this.f55052p.setEmoticon(str);
    }

    public void setGifInfo(C25630b c25630b) {
        C28020b3.f130648a.m141183G(c25630b, this.f55054r, this.f55052p, this.f55053q, true);
    }

    public StickerQuickItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m56565a(context);
        this.f55054r = new C23528a(context);
    }
}
