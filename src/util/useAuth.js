import { toast } from 'react-toastify'
import { useHistory } from 'react-router'
import axios from 'axios'
import { useEffect } from 'react'

export default function useAuth() {
    const history = useHistory()
    useEffect(() => {
        const jwt = JSON.parse(sessionStorage.getItem('jwt'))
        axios.get('http://localhost:8080/papersetter/id', {
            headers: {
                "Authorization": `Bearer ${jwt}`
            }
        }).then(resp => {
            if (resp.status == 403) {
                toast.error('Please Login First')
                history.push('/login')
            }
        }).catch(error => {
            if (error) {
                toast.error('Please Login First')
                history.push('/login')
            }
        })
    }, [])
}
