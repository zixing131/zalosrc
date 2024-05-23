package com.zing.zalo.bubbleview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.zing.zalo.p077ui.widget.RobotoEditText;

/* loaded from: classes3.dex */
public class ActionEditText extends RobotoEditText {

    /* renamed from: z */
    InterfaceC7390b f40192z;

    /* renamed from: com.zing.zalo.bubbleview.ActionEditText$a */
    /* loaded from: classes3.dex */
    private class C7389a extends InputConnectionWrapper {
        public C7389a(InputConnection inputConnection, boolean z11) {
            super(inputConnection, z11);
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean deleteSurroundingText(int i11, int i12) {
            InterfaceC7390b interfaceC7390b;
            if (i11 == 1 && i12 == 0 && (interfaceC7390b = ActionEditText.this.f40192z) != null) {
                interfaceC7390b.mo37523a();
            }
            return super.deleteSurroundingText(i11, i12);
        }
    }

    /* renamed from: com.zing.zalo.bubbleview.ActionEditText$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC7390b {
        /* renamed from: a */
        void mo37523a();

        /* renamed from: b */
        void mo37524b(ActionEditText actionEditText, String str);
    }

    public ActionEditText(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return new C7389a(super.onCreateInputConnection(editorInfo), true);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i11, KeyEvent keyEvent) {
        InterfaceC7390b interfaceC7390b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1 && (interfaceC7390b = this.f40192z) != null) {
            interfaceC7390b.mo37524b(this, getText().toString());
        }
        return super.onKeyPreIme(i11, keyEvent);
    }

    public void setmOnImeBack(InterfaceC7390b interfaceC7390b) {
        this.f40192z = interfaceC7390b;
    }

    public ActionEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
