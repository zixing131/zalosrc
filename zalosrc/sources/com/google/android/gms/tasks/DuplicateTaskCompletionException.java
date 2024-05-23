package com.google.android.gms.tasks;

import p342m6.AbstractC22888j;

/* loaded from: classes2.dex */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    private DuplicateTaskCompletionException(String str, Throwable th2) {
        super(str, th2);
    }

    /* renamed from: a */
    public static IllegalStateException m31525a(AbstractC22888j abstractC22888j) {
        String str;
        if (!abstractC22888j.mo117587p()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception mo117583l = abstractC22888j.mo117583l();
        if (mo117583l != null) {
            str = "failure";
        } else if (abstractC22888j.mo117588q()) {
            str = "result ".concat(String.valueOf(abstractC22888j.mo117584m()));
        } else if (abstractC22888j.mo117586o()) {
            str = "cancellation";
        } else {
            str = "unknown issue";
        }
        return new DuplicateTaskCompletionException("Complete with: ".concat(str), mo117583l);
    }
}
