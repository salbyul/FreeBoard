import {ref} from "vue";

export const user = ref({
    userId: '',
    password: '',
    passwordCheck: '',
    name: ''
});

export const validatorInit = () => {
    user.value = {
        userId: '',
        password: '',
        name: ''
    };
}

export const validateUserId = (userId) => {
    if (userId.length < 4 || userId.length > 11) {
        alert('아이디는 4자 이상, 12자 미만이어야 합니다.')
        return false;
    }
    if (!validateUserIdPattern(userId)) {
        alert("아이디에 영문과 숫자 1자 이상 포함되어야 하고, 특수문자는 \"-\", \"-\"만 가능합니다.")
        return false;
    }
    return true;
}

const validateUserIdPattern = (userId) => {
    let containAlphabetic = false;
    let containNumber = false;
    for (let i = 0; i < userId.length; i++) {
        let c = userId.charAt(i);
        if (c >= 1 && c <= 9) {
            containNumber = true;
            continue;
        }
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            containAlphabetic = true;
            continue;
        }
        if (c === '-' || c === '_') {
            continue;
        }
        return false;
    }
    if (!containNumber || !containAlphabetic) {
        return false;
    }
    return true;
}

const validatePassword = (password, passwordCheck, userId) => {
    if (password.length < 4 || password.length > 11) {
        alert('비밀번호는 4자 이상, 12자 미만이어야 합니다.');
        return false;
    }
    if (password === userId) {
        alert('비밀번호와 아이디는 같을 수 없습니다.');
        return false;
    }
    if (!validatePasswordPattern(password)) {
        alert('비밀번호에 3번 이상 연속된 문자를 사용할 수 없습니다.');
        return false;
    }
    if (password !== passwordCheck) {
        alert('비밀번호가 같지 않습니다.');
        return false;
    }
    return true;
}

const validatePasswordPattern = (password) => {
    let count = 1;
    let preChar = password.charAt(0);

    for (let i = 1; i < password.length; i++) {
        const currentChar = password.charAt(i);
        if (preChar === currentChar) {
            count++;
            if (count === 3) {
                return false;
            }
        } else {
            count = 1;
            preChar = currentChar;
        }
    }
    return true;
}

const validateName = (name) => {
    if (name.length < 2 || name.length > 4) {
        alert('이름은 2자 이상, 5자 미만이어야 합니다.');
        return false;
    }
    return true;
}

export const validateForJoin = () => {
    const userId = user.value.userId;
    const password = user.value.password;
    const passwordCheck = user.value.passwordCheck;
    const name = user.value.name;
    return validateUserId(userId) && validatePassword(password, passwordCheck, userId) && validateName(name);
}