package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.view.View;
import java.nio.CharBuffer;

/* renamed from: androidx.constraintlayout.motion.widget.a */
/* loaded from: classes2.dex */
public abstract class AbstractC1261a {
    /* renamed from: a */
    public static String m6057a() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
    }

    /* renamed from: b */
    public static String m6058b() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    /* renamed from: c */
    public static String m6059c(Context context, int i11) {
        if (i11 != -1) {
            try {
                return context.getResources().getResourceEntryName(i11);
            } catch (Exception unused) {
                return "?" + i11;
            }
        }
        return "UNKNOWN";
    }

    /* renamed from: d */
    public static String m6060d(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    /* renamed from: e */
    public static String m6061e(MotionLayout motionLayout, int i11) {
        return m6062f(motionLayout, i11, -1);
    }

    /* renamed from: f */
    public static String m6062f(MotionLayout motionLayout, int i11, int i12) {
        int length;
        if (i11 == -1) {
            return "UNDEFINED";
        }
        String resourceEntryName = motionLayout.getContext().getResources().getResourceEntryName(i11);
        if (i12 != -1) {
            if (resourceEntryName.length() > i12) {
                resourceEntryName = resourceEntryName.replaceAll("([^_])[aeiou]+", "$1");
            }
            if (resourceEntryName.length() > i12 && (length = resourceEntryName.replaceAll("[^_]", "").length()) > 0) {
                return resourceEntryName.replaceAll(CharBuffer.allocate((resourceEntryName.length() - i12) / length).toString().replace((char) 0, '.') + "_", "_");
            }
            return resourceEntryName;
        }
        return resourceEntryName;
    }
}
