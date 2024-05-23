package com.zing.zalo.zinstant.zom.node;

import com.zing.zalo.adapter.AbstractC6921a;
import com.zing.zalo.zinstant.zom.properties.ZOMInputText;

/* loaded from: classes7.dex */
public class ZOMInput extends ZOM {
    private static final int INPUT_TYPE_NONE = -1;
    public boolean disabled;
    public int inputType = -1;
    public ZOMInputText zomInputText;

    /* loaded from: classes7.dex */
    public static class ZOMInputFactory extends AbstractC6921a {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.zing.zalo.adapter.AbstractC6921a
        public ZOMInput create() {
            return ZOMInput.access$000();
        }
    }

    static /* synthetic */ ZOMInput access$000() {
        return requireNewObject();
    }

    public static ZOMInput createObject() {
        return requireNewObject();
    }

    private static ZOMInput requireNewObject() {
        return new ZOMInput();
    }

    public void setData(ZOMInputText zOMInputText, int i11, boolean z11) {
        this.zomInputText = zOMInputText;
        this.inputType = i11;
        this.disabled = z11;
        onPropertyChange();
    }

    public void setText(String str) {
        ZOMInputText zOMInputText = this.zomInputText;
        if (zOMInputText != null) {
            zOMInputText.setText(str);
        }
    }
}
